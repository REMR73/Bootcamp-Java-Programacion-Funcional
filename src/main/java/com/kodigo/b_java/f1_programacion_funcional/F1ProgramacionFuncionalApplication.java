package com.kodigo.b_java.f1_programacion_funcional;

import com.kodigo.b_java.f1_programacion_funcional.principal.F1ProgramacionFuncional;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class F1ProgramacionFuncionalApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(F1ProgramacionFuncionalApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		F1ProgramacionFuncional f1 = new F1ProgramacionFuncional();
		f1.main();
	}
}
