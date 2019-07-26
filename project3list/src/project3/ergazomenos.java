package project3;

public class ergazomenos {
             protected String onoma;
             protected String epwnumo;
             protected int afm;
             protected String dieu8unsh;
             
             public ergazomenos(){
            	 
             }
             
             public ergazomenos(String onoma,String epwnumo,int afm,String dieu8unsh){
            	 this.onoma=onoma;
            	 this.epwnumo=epwnumo;
            	 this.afm=afm;
            	 this.dieu8unsh=dieu8unsh;
            	 
             }
             
             public void print(){
            	 System.out.println("ονομα "+onoma);
            	 System.out.println("επωνυμο "+epwnumo);
            	 System.out.println("αφμ "+afm);
            	 System.out.println("διευθυνση "+dieu8unsh);
             }

			public String getOnoma() {
				return onoma;
			}

			public void setOnoma(String onoma) {
				this.onoma = onoma;
			}

			public String getEpwnumo() {
				return epwnumo;
			}

			public void setEpwnumo(String epwnumo) {
				this.epwnumo = epwnumo;
			}

			public int getAfm() {
				return afm;
			}

			public void setAfm(int afm) {
				this.afm = afm;
			}

			public String getDieu8unsh() {
				return dieu8unsh;
			}

			public void setDieu8unsh(String dieu8unsh) {
				this.dieu8unsh = dieu8unsh;
			}
             
             
}
