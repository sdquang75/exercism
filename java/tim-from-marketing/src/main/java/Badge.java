class Badge {
    public String print(Integer id, String name, String department) {
        //    throw new UnsupportedOperationException("Please implement the Badge.print() method");

      String der = (department == null) ? "OWNER" : department.toUpperCase();
      String idd = (id == null) ? "" : "[" + id + "] - ";


  return idd + name + " - " + der;

    }
}
