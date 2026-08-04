package defpackage;

/* JADX INFO: renamed from: lؚۡ۟, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C7584l {
    public final /* synthetic */ int yandex;

    public /* synthetic */ C7584l(int i) {
        this.yandex = i;
    }

    public static C3427l loadAd(C11196l c11196l, advert advertVar) {
        try {
            Ccase ccaseAdvert = Ccase.advert(advertVar.inmobi());
            if (!(ccaseAdvert instanceof Cclass)) {
                return new C3427l(c11196l, Cthrow.premium(ccaseAdvert).f36593l);
            }
            Cclass cclassInmobi = Cclass.inmobi(ccaseAdvert);
            return new C3427l(c11196l, Cthrow.premium(cclassInmobi.mo173throws(0)).f36593l, Cthrow.premium(cclassInmobi.mo173throws(1)).f36593l);
        } catch (Exception unused) {
            return new C3427l(c11196l, advertVar.inmobi());
        }
    }

    public static C13671l yandex(C18260l c18260l, advert advertVar) {
        try {
            Ccase ccaseAdvert = Ccase.advert(advertVar.inmobi());
            if (!(ccaseAdvert instanceof Cclass)) {
                return new C13671l(c18260l, Cthrow.premium(ccaseAdvert).f36593l);
            }
            Cclass cclassInmobi = Cclass.inmobi(ccaseAdvert);
            return new C13671l(c18260l, Cthrow.premium(cclassInmobi.mo173throws(0)).f36593l, Cthrow.premium(cclassInmobi.mo173throws(1)).f36593l);
        } catch (Exception unused) {
            return new C13671l(c18260l, advertVar.inmobi());
        }
    }
}
