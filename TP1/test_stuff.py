import unittest
from tp1 import Stuff

class TestInitIsEmpty(unittest.TestCase):
	def test_init_is_empty(self):
		stuff = Stuff()
		self.assertEqual([], stuff.refs())

class TestAddRefs(unittest.TestCase):
	def test_add_one_ref(self):
		stuff = Stuff()
		stuff.add_ref(123)
		self.assertEqual([123], stuff.refs())

	def test_add_multiple_refs(self):
		stuff = Stuff()
		stuff.add_ref(123)
		stuff.add_ref(456)
		self.assertTrue(123 in stuff.refs())
		self.assertTrue((456 in stuff.refs()))

	def test_cant_add_existing_ref(self):
		stuff = Stuff()
		stuff.add_ref(123)
		with self.assertRaises(ValueError) :
			stuff.add_ref(123)

class TestDeleteRefs(unittest.TestCase):
	def test_delete_existing_ref(self):
		stuff = Stuff()
		stuff.add_ref(123)
		stuff.del_ref(123)
		self.assertEqual([], stuff.refs())

	def test_cant_delete_not_existing_ref(self):
		stuff = Stuff()
		with self.assertRaises(ValueError):
			stuff.del_ref(123)

	def test_cant_delete_ref_with_item(self):
		stuff = Stuff()
		stuff.add_ref(123)
		stuff.add_item_ref(123, 15)
		with self.assertRaises(ValueError):
			stuff.del_ref(123)

class TestAddItems(unittest.TestCase):
	def test_add_items(self):
		stuff = Stuff()
		stuff.add_ref(123)
		stuff.add_item_ref(123, 15)
		stuff.add_item_ref(123, 15)
		self.assertEqual(30, stuff.items_ref(123))

	def test_cant_add_item_in_unexisting_ref(self):
		stuff = Stuff()
		stuff.add_ref(123)
		with self.assertRaises(ValueError):
			stuff.add_item_ref(456, 15)