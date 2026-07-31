package defpackage;

/* JADX INFO: renamed from: lًٖٞ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C16262l implements InterfaceC16975l, InterfaceC11724l, InterfaceC8671l {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ C13208l f31826l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f31827l;

    public /* synthetic */ C16262l(C13208l c13208l, int i) {
        this.f31827l = i;
        this.f31826l = c13208l;
    }

    @Override // defpackage.InterfaceC11724l
    public void billing(InterfaceC4725l interfaceC4725l, int i) {
        int i2 = this.f31827l;
        C13208l c13208l = this.f31826l;
        switch (i2) {
            case 2:
                interfaceC4725l.mo469switch(c13208l.crashlytics, i);
                break;
            case 3:
                interfaceC4725l.mo461l(c13208l.crashlytics, i);
                break;
            case 4:
                interfaceC4725l.mo459l(c13208l.crashlytics, i);
                break;
            case 5:
                interfaceC4725l.mo451l(c13208l.crashlytics, i);
                break;
            case 6:
                interfaceC4725l.mo446l(c13208l.crashlytics, i);
                break;
            case 7:
                interfaceC4725l.mo428final(c13208l.crashlytics, i);
                break;
            case 8:
                interfaceC4725l.metrica(c13208l.crashlytics, i);
                break;
            case 9:
                interfaceC4725l.mo429for(c13208l.crashlytics, i);
                break;
            case 10:
            default:
                interfaceC4725l.mo436l(c13208l.crashlytics, i);
                break;
            case 11:
                interfaceC4725l.mo466protected(c13208l.crashlytics, i);
                break;
            case 12:
                interfaceC4725l.applovin(c13208l.crashlytics, i);
                break;
            case 13:
                interfaceC4725l.mo435l(c13208l.crashlytics, i);
                break;
            case 14:
                interfaceC4725l.mo453l(c13208l.crashlytics, i);
                break;
            case 15:
                int iM3611l = c13208l.m3611l();
                BinderC11857l binderC11857l = c13208l.crashlytics;
                if (iM3611l < 6) {
                    interfaceC4725l.mo427extends(binderC11857l, i, 0.0f);
                } else {
                    interfaceC4725l.tapsense(binderC11857l, i);
                }
                break;
            case 16:
                interfaceC4725l.mo463native(c13208l.crashlytics, i);
                break;
        }
    }

    @Override // defpackage.InterfaceC16975l
    public void invoke(Object obj) {
        int i = this.f31827l;
        C13208l c13208l = this.f31826l;
        InterfaceC13521l interfaceC13521l = (InterfaceC13521l) obj;
        switch (i) {
            case 0:
                interfaceC13521l.mo2734else(c13208l.isVip);
                break;
            default:
                interfaceC13521l.mo2734else(c13208l.isVip);
                break;
        }
    }

    @Override // defpackage.InterfaceC8671l
    public void smaato(Object obj, C4094l c4094l) {
        ((InterfaceC13521l) obj).applovin(this.f31826l.yandex, new C3895l(c4094l));
    }
}
