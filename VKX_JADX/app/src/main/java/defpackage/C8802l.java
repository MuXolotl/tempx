package defpackage;

/* JADX INFO: renamed from: lٌٕۤ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C8802l extends AbstractC11801l {
    @Override // defpackage.AbstractC11801l
    /* JADX INFO: renamed from: new */
    public final void mo271new(C6956l c6956l, int i) {
        c6956l.m2133new(-1156718045);
        int i2 = i | (c6956l.admob(this) ? 4 : 2);
        byte b = 0;
        if (c6956l.m2127for(i2 & 1, (i2 & 3) != 2)) {
            Object objM2132native = c6956l.m2132native();
            C13863l c13863l = C1867l.yandex;
            if (objM2132native == c13863l) {
                objM2132native = AbstractC12311l.isPro(c6956l);
                c6956l.m2147try(objM2132native);
            }
            InterfaceC2262l interfaceC2262l = (InterfaceC2262l) objM2132native;
            int iAdmob = AbstractC6363l.admob(0, 1, c6956l);
            Object objM2132native2 = c6956l.m2132native();
            if (objM2132native2 == c13863l) {
                objM2132native2 = AbstractC8020l.smaato("");
                c6956l.m2147try(objM2132native2);
            }
            InterfaceC8714l interfaceC8714l = (InterfaceC8714l) objM2132native2;
            Object objM2132native3 = c6956l.m2132native();
            if (objM2132native3 == c13863l) {
                objM2132native3 = AbstractC8020l.smaato(Boolean.FALSE);
                c6956l.m2147try(objM2132native3);
            }
            InterfaceC8714l interfaceC8714l2 = (InterfaceC8714l) objM2132native3;
            Object objM2132native4 = c6956l.m2132native();
            if (objM2132native4 == c13863l) {
                objM2132native4 = AbstractC8020l.smaato(C16486l.yandex);
                c6956l.m2147try(objM2132native4);
            }
            AbstractC15497l.loadAd(null, AbstractC14566l.amazon(-678520857, new C7887l(this, b, b), c6956l), null, null, null, 0, 0L, 0L, null, AbstractC14566l.amazon(-1572295310, new C14893l(iAdmob, interfaceC2262l, interfaceC8714l, interfaceC8714l2, (InterfaceC8714l) objM2132native4), c6956l), c6956l, 805306416, 509);
        } else {
            c6956l.m2124else();
        }
        C4224l c4224lAds = c6956l.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new C7887l(this, i);
        }
    }
}
