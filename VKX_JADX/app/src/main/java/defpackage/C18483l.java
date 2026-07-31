package defpackage;

/* JADX INFO: renamed from: lٟؑ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C18483l {
    public final C12463l amazon = new C12463l(2);
    public final AbstractC14183l crashlytics;
    public final C5660l loadAd;
    public final C3654l yandex;

    public C18483l(C3654l c3654l, C5660l c5660l, C16977l c16977l) {
        this.yandex = c3654l;
        this.loadAd = c5660l;
        this.crashlytics = c16977l;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x007c  */
    /* JADX WARN: Code duplicated, block: B:42:0x0091  */
    public final void loadAd(C3654l c3654l, C6264l c6264l) {
        C12791l c12791l;
        C12791l c12791l2;
        String str;
        String str2;
        EnumC13846l enumC13846l;
        EnumC13846l enumC13846l2;
        InterfaceC4356l interfaceC4356l;
        InterfaceC4356l interfaceC4356l2;
        C12463l c12463l = this.amazon;
        Object[] objArr = c12463l.yandex;
        int i = c12463l.loadAd;
        for (int i2 = 0; i2 < i; i2++) {
            C4580l c4580l = (C4580l) ((InterfaceC18421l) objArr[i2]);
            c4580l.getClass();
            C6264l c6264lAdvert = c3654l.advert();
            int i3 = c3654l.f7685l;
            C6079l c6079l = c4580l.f9293l;
            ViewTreeObserverOnGlobalLayoutListenerC13840l viewTreeObserverOnGlobalLayoutListenerC13840l = c4580l.f9289l;
            if (c6264l != null) {
                Object objMopub = c6264l.f13225l.mopub(AbstractC0424l.subscription);
                if (objMopub == null) {
                    objMopub = null;
                }
                c12791l = (C12791l) objMopub;
            } else {
                c12791l = null;
            }
            if (c6264lAdvert != null) {
                Object objMopub2 = c6264lAdvert.f13225l.mopub(AbstractC0424l.subscription);
                if (objMopub2 == null) {
                    objMopub2 = null;
                }
                c12791l2 = (C12791l) objMopub2;
            } else {
                c12791l2 = null;
            }
            C12791l c12791l3 = C11485l.f23086l;
            if (!AbstractC8576l.yandex(c12791l2, c12791l3)) {
                if (AbstractC8576l.yandex(c12791l, c12791l3) && !AbstractC8576l.yandex(c12791l2, c12791l3)) {
                    c6079l.billing(viewTreeObserverOnGlobalLayoutListenerC13840l, i3, true);
                }
                if (c6264l != null) {
                    Object objMopub3 = c6264l.f13225l.mopub(AbstractC0424l.f1551throws);
                    if (objMopub3 == null) {
                        objMopub3 = null;
                    }
                    C3625l c3625l = (C3625l) objMopub3;
                    if (c3625l != null) {
                        str = c3625l.f7563l;
                    } else {
                        str = null;
                    }
                } else {
                    str = null;
                }
                if (c6264lAdvert != null) {
                    Object objMopub4 = c6264lAdvert.f13225l.mopub(AbstractC0424l.f1551throws);
                    if (objMopub4 == null) {
                        objMopub4 = null;
                    }
                    C3625l c3625l2 = (C3625l) objMopub4;
                    if (c3625l2 != null) {
                        str2 = c3625l2.f7563l;
                    } else {
                        str2 = null;
                    }
                } else {
                    str2 = null;
                }
                if (str != str2) {
                    if (str == null) {
                        c6079l.billing(viewTreeObserverOnGlobalLayoutListenerC13840l, i3, true);
                    } else if (str2 == null) {
                        c6079l.billing(viewTreeObserverOnGlobalLayoutListenerC13840l, i3, false);
                    } else if (AbstractC8576l.yandex(c12791l2, C11485l.f23085l)) {
                        c6079l.crashlytics(viewTreeObserverOnGlobalLayoutListenerC13840l, i3, AbstractC5941l.isVip(str2));
                    }
                }
                if (c6264l != null) {
                    Object objMopub5 = c6264l.f13225l.mopub(AbstractC0424l.f1546private);
                    if (objMopub5 == null) {
                        objMopub5 = null;
                    }
                    enumC13846l = (EnumC13846l) objMopub5;
                } else {
                    enumC13846l = null;
                }
                if (c6264lAdvert != null) {
                    Object objMopub6 = c6264lAdvert.f13225l.mopub(AbstractC0424l.f1546private);
                    if (objMopub6 == null) {
                        objMopub6 = null;
                    }
                    enumC13846l2 = (EnumC13846l) objMopub6;
                } else {
                    enumC13846l2 = null;
                }
                if (enumC13846l != enumC13846l2) {
                    if (enumC13846l == null) {
                        c6079l.billing(viewTreeObserverOnGlobalLayoutListenerC13840l, i3, true);
                    } else if (enumC13846l2 == null) {
                        c6079l.billing(viewTreeObserverOnGlobalLayoutListenerC13840l, i3, false);
                    } else if (AbstractC8576l.yandex(c12791l2, C11485l.f23090l)) {
                        int iOrdinal = enumC13846l2.ordinal();
                        Boolean bool = iOrdinal != 0 ? iOrdinal != 1 ? null : Boolean.FALSE : Boolean.TRUE;
                        if (bool != null) {
                            c6079l.crashlytics(viewTreeObserverOnGlobalLayoutListenerC13840l, i3, AbstractC5941l.signatures(bool.booleanValue()));
                        }
                    }
                }
                if (c6264l != null) {
                    Object objMopub7 = c6264l.f13225l.mopub(AbstractC0424l.tapsense);
                    if (objMopub7 == null) {
                        objMopub7 = null;
                    }
                    interfaceC4356l = (InterfaceC4356l) objMopub7;
                } else {
                    interfaceC4356l = null;
                }
                if (c6264lAdvert != null) {
                    Object objMopub8 = c6264lAdvert.f13225l.mopub(AbstractC0424l.tapsense);
                    if (objMopub8 == null) {
                        objMopub8 = null;
                    }
                    interfaceC4356l2 = (InterfaceC4356l) objMopub8;
                } else {
                    interfaceC4356l2 = null;
                }
                if (!AbstractC8576l.yandex(interfaceC4356l, interfaceC4356l2)) {
                    if (interfaceC4356l == null) {
                        c6079l.billing(viewTreeObserverOnGlobalLayoutListenerC13840l, i3, true);
                    } else if (interfaceC4356l2 == null) {
                        c6079l.billing(viewTreeObserverOnGlobalLayoutListenerC13840l, i3, false);
                    } else {
                        c6079l.crashlytics(viewTreeObserverOnGlobalLayoutListenerC13840l, i3, ((C5828l) interfaceC4356l2).yandex);
                    }
                }
            } else if (!AbstractC8576l.yandex(c12791l, c12791l3)) {
                c6079l.billing(viewTreeObserverOnGlobalLayoutListenerC13840l, i3, false);
            }
            boolean z = c6264l != null && c6264l.f13225l.loadAd(AbstractC0424l.ads);
            boolean z2 = c6264lAdvert != null && c6264lAdvert.f13225l.loadAd(AbstractC0424l.ads);
            if (z != z2) {
                C4622l c4622l = c4580l.f9291l;
                if (z2) {
                    c4622l.yandex(i3);
                } else {
                    c4622l.mopub(i3);
                }
            }
        }
    }

    public final C18666l yandex() {
        return new C18666l(this.loadAd, false, this.yandex, new C6264l());
    }
}
