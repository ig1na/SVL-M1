package processesTests;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import processes.ProcessController;
import processes.Process;

import static org.mockito.Mockito.*;

class ProcessControllerTest {

	ProcessController pc;
	@BeforeEach
	void setUp() throws Exception {
		pc = new ProcessController();
	}

	@Test
	void testNbStartedProc() {
		Process p1 = mock(Process.class, "p1");
		Process p2 = mock(Process.class, "p2");
		Process p3 = mock(Process.class, "p3");
		
		pc.addProc(p1);
		pc.addProc(p2);
		pc.addProc(p3);
		
		when(p1.isRunning()).thenReturn(true);
		when(p2.isRunning()).thenReturn(false);
		when(p3.isRunning()).thenReturn(true);
		
		assertEquals(pc.nbStartedProc(), 2);
	}

}
