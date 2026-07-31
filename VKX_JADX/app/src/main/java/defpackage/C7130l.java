package defpackage;

/* JADX INFO: renamed from: lًؚٗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C7130l extends Cnative implements premium {

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final Ccase f14935l;

    public C7130l(C7100l c7100l) {
        this.f14935l = null;
        this.f14935l = c7100l.billing();
    }

    public static C7130l vip(Object obj) {
        String strAdmob;
        if (obj == null || (obj instanceof C7130l)) {
            return (C7130l) obj;
        }
        if (obj instanceof Ccase) {
            return new C7130l((Ccase) obj);
        }
        if (obj instanceof byte[]) {
            try {
                return new C7130l(Ccase.advert((byte[]) obj));
            } catch (Exception e) {
                strAdmob = AbstractC12900l.admob(e, new StringBuilder("unable to parse encoded data: "));
            }
        } else {
            strAdmob = "unknown object in getInstance()";
        }
        C8339l.metrica(strAdmob);
        return null;
    }

    @Override // defpackage.Cnative, defpackage.applovin
    public final Ccase billing() {
        return this.f14935l;
    }

    public C7130l(Cfor cfor) {
        this.f14935l = cfor;
    }

    public C7130l(Ccase ccase) {
        this.f14935l = ccase;
    }

    public C7130l() {
        this.f14935l = C14998l.f29509l;
    }
}
