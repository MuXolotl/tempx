package defpackage;

/* JADX INFO: renamed from: lّؖۖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC4071l {
    public static final C15578l yandex = new C15578l(-1002388094, false, new C3817l(22));
    public static final C15578l loadAd = new C15578l(-1600792149, false, new C3817l(23));
    public static final C15578l crashlytics = new C15578l(-903720551, false, new C3817l(24));
    public static final C15578l amazon = new C15578l(827335806, false, new C3817l(25));

    /* JADX WARN: Multi-variable type inference failed */
    public static final boolean amazon(InterfaceC12556l interfaceC12556l) {
        AbstractC14971l abstractC14971lLoadAd = ((AbstractC14971l) interfaceC12556l).f29454l;
        C17893l c17893l = null;
        while (abstractC14971lLoadAd != null) {
            if (abstractC14971lLoadAd instanceof C6543l) {
                if (AbstractC6745l.subs((C6543l) abstractC14971lLoadAd)) {
                    return true;
                }
            } else if ((abstractC14971lLoadAd.f29450l & 1024) != 0 && (abstractC14971lLoadAd instanceof AbstractC11340l)) {
                int i = 0;
                for (AbstractC14971l abstractC14971l = ((AbstractC11340l) abstractC14971lLoadAd).f22875l; abstractC14971l != null; abstractC14971l = abstractC14971l.f29460l) {
                    if ((abstractC14971l.f29450l & 1024) != 0) {
                        i++;
                        if (i == 1) {
                            abstractC14971lLoadAd = abstractC14971l;
                        } else {
                            if (c17893l == null) {
                                c17893l = new C17893l(0, new AbstractC14971l[16]);
                            }
                            if (abstractC14971lLoadAd != null) {
                                c17893l.crashlytics(abstractC14971lLoadAd);
                                abstractC14971lLoadAd = null;
                            }
                            c17893l.crashlytics(abstractC14971l);
                        }
                    }
                }
                if (i == 1) {
                }
            }
            abstractC14971lLoadAd = AbstractC5573l.loadAd(c17893l);
        }
        AbstractC14971l abstractC14971l2 = (AbstractC14971l) interfaceC12556l;
        if (!abstractC14971l2.f29454l.f29462l) {
            AbstractC0081l.crashlytics("visitChildren called on an unattached node");
        }
        C17893l c17893l2 = new C17893l(0, new AbstractC14971l[16]);
        AbstractC14971l abstractC14971l3 = abstractC14971l2.f29454l;
        AbstractC14971l abstractC14971l4 = abstractC14971l3.f29460l;
        if (abstractC14971l4 == null) {
            AbstractC5573l.yandex(c17893l2, abstractC14971l3);
        } else {
            c17893l2.crashlytics(abstractC14971l4);
        }
        while (true) {
            int i2 = c17893l2.f34846l;
            if (i2 == 0) {
                return false;
            }
            AbstractC14971l abstractC14971lLoadAd2 = (AbstractC14971l) c17893l2.vip(i2 - 1);
            if ((abstractC14971lLoadAd2.f29457l & 1024) == 0) {
                AbstractC5573l.yandex(c17893l2, abstractC14971lLoadAd2);
            } else {
                while (abstractC14971lLoadAd2 != null) {
                    if ((abstractC14971lLoadAd2.f29450l & 1024) != 0) {
                        C17893l c17893l3 = null;
                        while (abstractC14971lLoadAd2 != null) {
                            if (abstractC14971lLoadAd2 instanceof C6543l) {
                                if (AbstractC6745l.subs((C6543l) abstractC14971lLoadAd2)) {
                                    return true;
                                }
                            } else if ((abstractC14971lLoadAd2.f29450l & 1024) != 0 && (abstractC14971lLoadAd2 instanceof AbstractC11340l)) {
                                int i3 = 0;
                                for (AbstractC14971l abstractC14971l5 = ((AbstractC11340l) abstractC14971lLoadAd2).f22875l; abstractC14971l5 != null; abstractC14971l5 = abstractC14971l5.f29460l) {
                                    if ((abstractC14971l5.f29450l & 1024) != 0) {
                                        i3++;
                                        if (i3 == 1) {
                                            abstractC14971lLoadAd2 = abstractC14971l5;
                                        } else {
                                            if (c17893l3 == null) {
                                                c17893l3 = new C17893l(0, new AbstractC14971l[16]);
                                            }
                                            if (abstractC14971lLoadAd2 != null) {
                                                c17893l3.crashlytics(abstractC14971lLoadAd2);
                                                abstractC14971lLoadAd2 = null;
                                            }
                                            c17893l3.crashlytics(abstractC14971l5);
                                        }
                                    }
                                }
                                if (i3 == 1) {
                                }
                            }
                            abstractC14971lLoadAd2 = AbstractC5573l.loadAd(c17893l3);
                        }
                        break;
                    }
                    abstractC14971lLoadAd2 = abstractC14971lLoadAd2.f29460l;
                }
            }
        }
    }

    public static final void crashlytics(C13006l c13006l, InterfaceC3770l interfaceC3770l, int i) {
        while (true) {
            int i2 = c13006l.license;
            if (i > i2 && i < c13006l.Signature) {
                return;
            }
            if (i2 == 0 && i == 0) {
                return;
            }
            c13006l.m3520extends();
            if (c13006l.advert(c13006l.license)) {
                interfaceC3770l.adcel();
            }
            c13006l.isPro();
        }
    }

    public static final long loadAd() {
        return Thread.currentThread().getId();
    }

    public static final C17535l yandex(boolean z) {
        return z ? new C17535l(0) : new C17535l(1);
    }
}
