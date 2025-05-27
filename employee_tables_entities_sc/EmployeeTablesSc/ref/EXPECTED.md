#Expected Employee Tables

Employee (abstract, no table)
├── ContractualEmployee (concrete, table, alias PK)
│   ├── Instructor (concrete, table)
│   └── Ta (concrete, table)
└── PermanentEmployee (concrete, table, email PK)
├── SoftwareDeveloper (concrete, table)
└── ProgramManager (concrete, table)