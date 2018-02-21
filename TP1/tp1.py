# TP1 - SVL - 1617
# classe mystere a tester
# M. Nebut - 01 / 2016 - revu 2017

class Stuff:
    """
    Une classe non (ou tres mal) documentee pour experimenter pendant le tp1.
    """

    def __init__(self):
        """
        Le constructeur.
        """
        self.__stuff = dict()

    def refs(self):
        """
        Retourne les refs.
        """
        return list(self.__stuff.keys())
        
    def add_ref(self, ref):
        """
        Ajoute une ref.
        """
        if ref in self.refs():
            raise ValueError()
        self.__stuff[ref] = 0

    def del_ref(self, ref):
        """
        Supprime une ref.
        """
        if ref not in self.refs():
            raise ValueError()
        if self.__stuff[ref] != 0:
            raise ValueError()
        del self.__stuff[ref]

    def items_ref(self, ref):
        """
        Retourne les items pour chaque ref.
        """
        if ref not in self.refs():
            raise ValueError()        
        return self.__stuff[ref]

    def add_item_ref(self, ref, nbof):
        """
        Ajout pour une ref.
        """
        if nbof <= 0:
            raise ValueError()
        if ref not in self.refs():
            raise ValueError()
        self.__stuff[ref] += nbof

    def cons_item_ref(self, ref, nbof):
        """
        Consommation pour une ref.
        """
        if ref not in self.refs():
            raise ValueError()
        if nbof <= 0 or nbof > self.item_ref(ref):
            raise ValueError()
        self.__stuff[ref] -= nbof

        
