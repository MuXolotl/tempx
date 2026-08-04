package defpackage;

import org.conscrypt.PSKKeyManager;

/* JADX INFO: renamed from: lؔۧٔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3068l {
    public static final C7661l yandex;

    static {
        C7661l c7661l = AbstractC4785l.yandex;
        yandex = new C7661l();
    }

    public static final int amazon(InterfaceC13112l interfaceC13112l) {
        int i = interfaceC13112l instanceof InterfaceC6263l ? 3 : 1;
        if (interfaceC13112l instanceof C11881l) {
            i |= 4;
        }
        if (interfaceC13112l instanceof InterfaceC5116l) {
            i |= 8;
        }
        if (interfaceC13112l instanceof C13408l) {
            i |= 16;
        }
        if (interfaceC13112l instanceof AbstractC17450l) {
            i |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
        }
        if (interfaceC13112l instanceof InterfaceC11806l) {
            i |= 64;
        }
        return interfaceC13112l instanceof InterfaceC16537l ? 524288 | i : i;
    }

    public static final int billing(AbstractC14971l abstractC14971l) {
        if (!(abstractC14971l instanceof AbstractC11340l)) {
            return purchase(abstractC14971l);
        }
        AbstractC11340l abstractC11340l = (AbstractC11340l) abstractC14971l;
        int iBilling = abstractC11340l.f22876l;
        for (AbstractC14971l abstractC14971l2 = abstractC11340l.f22875l; abstractC14971l2 != null; abstractC14971l2 = abstractC14971l2.f29460l) {
            iBilling |= billing(abstractC14971l2);
        }
        return iBilling;
    }

    public static final void crashlytics(AbstractC14971l abstractC14971l) {
        if (!abstractC14971l.f29462l) {
            AbstractC0081l.crashlytics("autoInvalidateUpdatedNode called on unattached node");
        }
        yandex(abstractC14971l, -1, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void loadAd(AbstractC14971l abstractC14971l, int i, int i2) {
        if (i2 != 0 || abstractC14971l.mo512l()) {
            if ((i & 2) != 0 && (abstractC14971l instanceof InterfaceC7150l)) {
                AbstractC4047l.isPro((InterfaceC7150l) abstractC14971l);
                if (i2 == 2) {
                    AbstractC5573l.smaato(abstractC14971l, 2).m4481l();
                }
            }
            if ((i & 128) != 0 && i2 != 2) {
                AbstractC5573l.metrica(abstractC14971l).m1395synchronized();
            }
            if ((4194304 & i) != 0 && i2 != 2) {
                AbstractC5573l.metrica(abstractC14971l).m1387new(false);
            }
            if ((i & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0 && (abstractC14971l instanceof InterfaceC3506l)) {
                if (i2 == 1) {
                    C3654l c3654lMetrica = AbstractC5573l.metrica(abstractC14971l);
                    c3654lMetrica.m1381finally(c3654lMetrica.f7672l + 1);
                } else if (i2 == 2) {
                    C3654l c3654lMetrica2 = AbstractC5573l.metrica(abstractC14971l);
                    c3654lMetrica2.m1381finally(c3654lMetrica2.f7672l - 1);
                }
                if (i2 != 2) {
                    C3654l c3654lMetrica3 = AbstractC5573l.metrica(abstractC14971l);
                    if (c3654lMetrica3.f7672l != 0 && !c3654lMetrica3.adcel() && !c3654lMetrica3.ads() && !c3654lMetrica3.f7681l) {
                        ViewTreeObserverOnGlobalLayoutListenerC13840l viewTreeObserverOnGlobalLayoutListenerC13840l = (ViewTreeObserverOnGlobalLayoutListenerC13840l) AbstractC5672l.yandex(c3654lMetrica3);
                        C18396l c18396l = viewTreeObserverOnGlobalLayoutListenerC13840l.f27005l.purchase;
                        c18396l.getClass();
                        if (c3654lMetrica3.f7672l > 0) {
                            ((C17893l) c18396l.f35934l).crashlytics(c3654lMetrica3);
                            c3654lMetrica3.f7681l = true;
                        }
                        viewTreeObserverOnGlobalLayoutListenerC13840l.m3774synchronized(null);
                    }
                }
            }
            if ((i & 4) != 0 && (abstractC14971l instanceof InterfaceC16388l)) {
                AbstractC2697l.firebase((InterfaceC16388l) abstractC14971l);
            }
            if ((i & 8) != 0 && (abstractC14971l instanceof InterfaceC3703l)) {
                AbstractC5573l.metrica(abstractC14971l).f7676l = true;
            }
            if ((i & 64) != 0 && (abstractC14971l instanceof InterfaceC2653l)) {
                C14070l c14070l = AbstractC5573l.metrica((InterfaceC2653l) abstractC14971l).f7667l;
                c14070l.startapp.f29329l = true;
                C4020l c4020l = c14070l.adcel;
                if (c4020l != null) {
                    c4020l.f8271l = true;
                }
            }
            if ((i & 2048) != 0 && (abstractC14971l instanceof InterfaceC3228l)) {
                InterfaceC3228l interfaceC3228l = (InterfaceC3228l) abstractC14971l;
                C18722l.loadAd = null;
                interfaceC3228l.mo1299synchronized(C18722l.yandex);
                if (C18722l.loadAd != null) {
                    AbstractC14971l abstractC14971l2 = (AbstractC14971l) interfaceC3228l;
                    if (!abstractC14971l2.f29454l.f29462l) {
                        AbstractC0081l.crashlytics("visitChildren called on an unattached node");
                    }
                    C17893l c17893l = new C17893l(0, new AbstractC14971l[16]);
                    AbstractC14971l abstractC14971l3 = abstractC14971l2.f29454l;
                    AbstractC14971l abstractC14971l4 = abstractC14971l3.f29460l;
                    if (abstractC14971l4 == null) {
                        AbstractC5573l.yandex(c17893l, abstractC14971l3);
                    } else {
                        c17893l.crashlytics(abstractC14971l4);
                    }
                    while (true) {
                        int i3 = c17893l.f34846l;
                        if (i3 == 0) {
                            break;
                        }
                        AbstractC14971l abstractC14971lLoadAd = (AbstractC14971l) c17893l.vip(i3 - 1);
                        if ((abstractC14971lLoadAd.f29457l & 1024) == 0) {
                            AbstractC5573l.yandex(c17893l, abstractC14971lLoadAd);
                        } else {
                            while (abstractC14971lLoadAd != null) {
                                if ((abstractC14971lLoadAd.f29450l & 1024) != 0) {
                                    C17893l c17893l2 = null;
                                    while (abstractC14971lLoadAd != null) {
                                        if (abstractC14971lLoadAd instanceof C6543l) {
                                            C6543l c6543l = (C6543l) abstractC14971lLoadAd;
                                            C15779l c15779l = ((C15552l) ((ViewTreeObserverOnGlobalLayoutListenerC13840l) AbstractC5573l.startapp(c6543l)).getFocusOwner()).amazon;
                                            if (c15779l.crashlytics.yandex(c6543l)) {
                                                c15779l.yandex();
                                            }
                                        } else if ((abstractC14971lLoadAd.f29450l & 1024) != 0 && (abstractC14971lLoadAd instanceof AbstractC11340l)) {
                                            int i4 = 0;
                                            for (AbstractC14971l abstractC14971l5 = ((AbstractC11340l) abstractC14971lLoadAd).f22875l; abstractC14971l5 != null; abstractC14971l5 = abstractC14971l5.f29460l) {
                                                if ((abstractC14971l5.f29450l & 1024) != 0) {
                                                    i4++;
                                                    if (i4 == 1) {
                                                        abstractC14971lLoadAd = abstractC14971l5;
                                                    } else {
                                                        if (c17893l2 == null) {
                                                            c17893l2 = new C17893l(0, new AbstractC14971l[16]);
                                                        }
                                                        if (abstractC14971lLoadAd != null) {
                                                            c17893l2.crashlytics(abstractC14971lLoadAd);
                                                            abstractC14971lLoadAd = null;
                                                        }
                                                        c17893l2.crashlytics(abstractC14971l5);
                                                    }
                                                }
                                            }
                                            if (i4 == 1) {
                                            }
                                        }
                                        abstractC14971lLoadAd = AbstractC5573l.loadAd(c17893l2);
                                    }
                                    break;
                                }
                                abstractC14971lLoadAd = abstractC14971lLoadAd.f29460l;
                            }
                        }
                    }
                }
            }
            if ((i & 4096) != 0 && (abstractC14971l instanceof InterfaceC10653l)) {
                InterfaceC10653l interfaceC10653l = (InterfaceC10653l) abstractC14971l;
                C15779l c15779l2 = ((C15552l) ((ViewTreeObserverOnGlobalLayoutListenerC13840l) AbstractC5573l.startapp(interfaceC10653l)).getFocusOwner()).amazon;
                if (c15779l2.amazon.yandex(interfaceC10653l)) {
                    c15779l2.yandex();
                }
            }
            if ((i & 2097152) != 0 && (abstractC14971l instanceof InterfaceC17612l) && i2 == 2) {
                ((InterfaceC17612l) abstractC14971l).mo1985try();
            }
        }
    }

    public static final boolean mopub(int i) {
        return ((i & 128) != 0) | ((i & 4194304) != 0);
    }

    public static final int purchase(AbstractC14971l abstractC14971l) {
        int i = abstractC14971l.f29450l;
        if (i != 0) {
            return i;
        }
        Class<?> cls = abstractC14971l.getClass();
        C7661l c7661l = yandex;
        int iAmazon = c7661l.amazon(cls);
        if (iAmazon >= 0) {
            return c7661l.crashlytics[iAmazon];
        }
        int i2 = abstractC14971l instanceof InterfaceC7150l ? 3 : 1;
        if (abstractC14971l instanceof InterfaceC16388l) {
            i2 |= 4;
        }
        if (abstractC14971l instanceof InterfaceC3703l) {
            i2 |= 8;
        }
        if (abstractC14971l instanceof InterfaceC13202l) {
            i2 |= 16;
        }
        if (abstractC14971l instanceof InterfaceC18141l) {
            i2 |= 32;
        }
        if (abstractC14971l instanceof InterfaceC2653l) {
            i2 |= 64;
        }
        if (abstractC14971l instanceof InterfaceC15641l) {
            i2 |= 4194432;
        } else if (abstractC14971l instanceof InterfaceC4325l) {
            i2 |= 128;
        }
        if (abstractC14971l instanceof InterfaceC3506l) {
            i2 |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
        }
        if (abstractC14971l instanceof C8030l) {
            i2 |= AbstractC12994l.AUDIO_CONTENT_BUFFER_SIZE;
        }
        if (abstractC14971l instanceof C6543l) {
            i2 |= 1024;
        }
        if (abstractC14971l instanceof InterfaceC3228l) {
            i2 |= 2048;
        }
        if (abstractC14971l instanceof InterfaceC10653l) {
            i2 |= 4096;
        }
        if (abstractC14971l instanceof InterfaceC16036l) {
            i2 |= 8192;
        }
        if (abstractC14971l instanceof C4682l) {
            i2 |= 16384;
        }
        if (abstractC14971l instanceof InterfaceC16031l) {
            i2 |= 32768;
        }
        if (abstractC14971l instanceof InterfaceC11189l) {
            i2 |= 262144;
        }
        if (abstractC14971l instanceof InterfaceC16537l) {
            i2 |= 524288;
        }
        if (abstractC14971l instanceof C6543l) {
            i2 |= 1048576;
        }
        if (abstractC14971l instanceof InterfaceC17612l) {
            i2 |= 2097152;
        }
        if (abstractC14971l instanceof C8604l) {
            i2 |= 8388608;
        }
        c7661l.mopub(i2, cls);
        return i2;
    }

    public static final void yandex(AbstractC14971l abstractC14971l, int i, int i2) {
        if (!(abstractC14971l instanceof AbstractC11340l)) {
            loadAd(abstractC14971l, i & abstractC14971l.f29450l, i2);
            return;
        }
        AbstractC11340l abstractC11340l = (AbstractC11340l) abstractC14971l;
        int i3 = abstractC11340l.f22876l;
        loadAd(abstractC14971l, i3 & i, i2);
        int i4 = (~i3) & i;
        for (AbstractC14971l abstractC14971l2 = abstractC11340l.f22875l; abstractC14971l2 != null; abstractC14971l2 = abstractC14971l2.f29460l) {
            yandex(abstractC14971l2, i4, i2);
        }
    }
}
