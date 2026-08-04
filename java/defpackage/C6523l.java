package defpackage;

/* JADX INFO: renamed from: lؙٗ۟, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C6523l {
    public final C17893l yandex = new C17893l(0, new InterfaceC12556l[16]);
    public static final C6523l loadAd = new C6523l();
    public static final C6523l crashlytics = new C6523l();
    public static final C6523l amazon = new C6523l();

    public static void loadAd(C6523l c6523l) {
        c6523l.getClass();
        if (c6523l == loadAd) {
            C8339l.smaato("\n    Please check whether the focusRequester is FocusRequester.Cancel or FocusRequester.Default\n    before invoking any functions on the focusRequester.\n");
            return;
        }
        if (c6523l == crashlytics) {
            C8339l.smaato("\n    Please check whether the focusRequester is FocusRequester.Cancel or FocusRequester.Default\n    before invoking any functions on the focusRequester.\n");
            return;
        }
        C17893l c17893l = c6523l.yandex;
        int i = c17893l.f34846l;
        if (i == 0) {
            System.out.println((Object) "FocusRelatedWarning: \n   FocusRequester is not initialized. Here are some possible fixes:\n\n   1. Remember the FocusRequester: val focusRequester = remember { FocusRequester() }\n   2. Did you forget to add a Modifier.focusRequester() ?\n   3. Are you attempting to request focus during composition? Focus requests should be made in\n   response to some event. Eg Modifier.clickable { focusRequester.requestFocus() }\n");
            return;
        }
        Object[] objArr = c17893l.f34848l;
        for (int i2 = 0; i2 < i; i2++) {
            Object obj = (InterfaceC12556l) objArr[i2];
            if (!((AbstractC14971l) obj).f29454l.f29462l) {
                AbstractC0081l.crashlytics("visitChildren called on an unattached node");
            }
            C17893l c17893l2 = new C17893l(0, new AbstractC14971l[16]);
            AbstractC14971l abstractC14971l = ((AbstractC14971l) obj).f29454l;
            AbstractC14971l abstractC14971l2 = abstractC14971l.f29460l;
            if (abstractC14971l2 == null) {
                AbstractC5573l.yandex(c17893l2, abstractC14971l);
            } else {
                c17893l2.crashlytics(abstractC14971l2);
            }
            while (true) {
                int i3 = c17893l2.f34846l;
                if (i3 == 0) {
                    break;
                }
                AbstractC14971l abstractC14971lLoadAd = (AbstractC14971l) c17893l2.vip(i3 - 1);
                if ((abstractC14971lLoadAd.f29457l & 1024) == 0) {
                    AbstractC5573l.yandex(c17893l2, abstractC14971lLoadAd);
                } else {
                    while (abstractC14971lLoadAd != null) {
                        if ((abstractC14971lLoadAd.f29450l & 1024) != 0) {
                            C17893l c17893l3 = null;
                            while (abstractC14971lLoadAd != null) {
                                if (abstractC14971lLoadAd instanceof C6543l) {
                                    if (((C6543l) abstractC14971lLoadAd).m2026l(7)) {
                                        break;
                                    }
                                } else if ((abstractC14971lLoadAd.f29450l & 1024) != 0 && (abstractC14971lLoadAd instanceof AbstractC11340l)) {
                                    int i4 = 0;
                                    for (AbstractC14971l abstractC14971l3 = ((AbstractC11340l) abstractC14971lLoadAd).f22875l; abstractC14971l3 != null; abstractC14971l3 = abstractC14971l3.f29460l) {
                                        if ((abstractC14971l3.f29450l & 1024) != 0) {
                                            i4++;
                                            if (i4 == 1) {
                                                abstractC14971lLoadAd = abstractC14971l3;
                                            } else {
                                                if (c17893l3 == null) {
                                                    c17893l3 = new C17893l(0, new AbstractC14971l[16]);
                                                }
                                                if (abstractC14971lLoadAd != null) {
                                                    c17893l3.crashlytics(abstractC14971lLoadAd);
                                                    abstractC14971lLoadAd = null;
                                                }
                                                c17893l3.crashlytics(abstractC14971l3);
                                            }
                                        }
                                    }
                                    if (i4 == 1) {
                                    }
                                }
                                abstractC14971lLoadAd = AbstractC5573l.loadAd(c17893l3);
                            }
                            break;
                        }
                        abstractC14971lLoadAd = abstractC14971lLoadAd.f29460l;
                    }
                }
            }
        }
    }

    public final void crashlytics() {
        C17893l c17893l = this.yandex;
        int i = c17893l.f34846l;
        if (i == 0) {
            System.out.println((Object) "FocusRelatedWarning: \n   FocusRequester is not initialized. Here are some possible fixes:\n\n   1. Remember the FocusRequester: val focusRequester = remember { FocusRequester() }\n   2. Did you forget to add a Modifier.focusRequester() ?\n   3. Are you attempting to request focus during composition? Focus requests should be made in\n   response to some event. Eg Modifier.clickable { focusRequester.requestFocus() }\n");
            return;
        }
        Object[] objArr = c17893l.f34848l;
        for (int i2 = 0; i2 < i && !AbstractC4071l.amazon((InterfaceC12556l) objArr[i2]); i2++) {
        }
    }

    public final void yandex() {
        C17893l c17893l = this.yandex;
        int i = c17893l.f34846l;
        if (i == 0) {
            System.out.println((Object) "FocusRelatedWarning: \n   FocusRequester is not initialized. Here are some possible fixes:\n\n   1. Remember the FocusRequester: val focusRequester = remember { FocusRequester() }\n   2. Did you forget to add a Modifier.focusRequester() ?\n   3. Are you attempting to request focus during composition? Focus requests should be made in\n   response to some event. Eg Modifier.clickable { focusRequester.requestFocus() }\n");
            return;
        }
        Object[] objArr = c17893l.f34848l;
        for (int i2 = 0; i2 < i; i2++) {
            Object obj = (InterfaceC12556l) objArr[i2];
            AbstractC14971l abstractC14971lLoadAd = ((AbstractC14971l) obj).f29454l;
            C17893l c17893l2 = null;
            while (abstractC14971lLoadAd != null) {
                if (abstractC14971lLoadAd instanceof C6543l) {
                    if (AbstractC12225l.amazon((C6543l) abstractC14971lLoadAd)) {
                        return;
                    }
                } else if ((abstractC14971lLoadAd.f29450l & 1024) != 0 && (abstractC14971lLoadAd instanceof AbstractC11340l)) {
                    int i3 = 0;
                    for (AbstractC14971l abstractC14971l = ((AbstractC11340l) abstractC14971lLoadAd).f22875l; abstractC14971l != null; abstractC14971l = abstractC14971l.f29460l) {
                        if ((abstractC14971l.f29450l & 1024) != 0) {
                            i3++;
                            if (i3 == 1) {
                                abstractC14971lLoadAd = abstractC14971l;
                            } else {
                                if (c17893l2 == null) {
                                    c17893l2 = new C17893l(0, new AbstractC14971l[16]);
                                }
                                if (abstractC14971lLoadAd != null) {
                                    c17893l2.crashlytics(abstractC14971lLoadAd);
                                    abstractC14971lLoadAd = null;
                                }
                                c17893l2.crashlytics(abstractC14971l);
                            }
                        }
                    }
                    if (i3 == 1) {
                    }
                }
                abstractC14971lLoadAd = AbstractC5573l.loadAd(c17893l2);
            }
            AbstractC14971l abstractC14971l2 = (AbstractC14971l) obj;
            if (!abstractC14971l2.f29454l.f29462l) {
                AbstractC0081l.crashlytics("visitChildren called on an unattached node");
            }
            C17893l c17893l3 = new C17893l(0, new AbstractC14971l[16]);
            AbstractC14971l abstractC14971l3 = abstractC14971l2.f29454l;
            AbstractC14971l abstractC14971l4 = abstractC14971l3.f29460l;
            if (abstractC14971l4 == null) {
                AbstractC5573l.yandex(c17893l3, abstractC14971l3);
            } else {
                c17893l3.crashlytics(abstractC14971l4);
            }
            while (true) {
                int i4 = c17893l3.f34846l;
                if (i4 != 0) {
                    AbstractC14971l abstractC14971lLoadAd2 = (AbstractC14971l) c17893l3.vip(i4 - 1);
                    if ((abstractC14971lLoadAd2.f29457l & 1024) == 0) {
                        AbstractC5573l.yandex(c17893l3, abstractC14971lLoadAd2);
                    } else {
                        while (abstractC14971lLoadAd2 != null) {
                            if ((abstractC14971lLoadAd2.f29450l & 1024) != 0) {
                                C17893l c17893l4 = null;
                                while (abstractC14971lLoadAd2 != null) {
                                    if (abstractC14971lLoadAd2 instanceof C6543l) {
                                        if (AbstractC12225l.amazon((C6543l) abstractC14971lLoadAd2)) {
                                            return;
                                        }
                                    } else if ((abstractC14971lLoadAd2.f29450l & 1024) != 0 && (abstractC14971lLoadAd2 instanceof AbstractC11340l)) {
                                        int i5 = 0;
                                        for (AbstractC14971l abstractC14971l5 = ((AbstractC11340l) abstractC14971lLoadAd2).f22875l; abstractC14971l5 != null; abstractC14971l5 = abstractC14971l5.f29460l) {
                                            if ((abstractC14971l5.f29450l & 1024) != 0) {
                                                i5++;
                                                if (i5 == 1) {
                                                    abstractC14971lLoadAd2 = abstractC14971l5;
                                                } else {
                                                    if (c17893l4 == null) {
                                                        c17893l4 = new C17893l(0, new AbstractC14971l[16]);
                                                    }
                                                    if (abstractC14971lLoadAd2 != null) {
                                                        c17893l4.crashlytics(abstractC14971lLoadAd2);
                                                        abstractC14971lLoadAd2 = null;
                                                    }
                                                    c17893l4.crashlytics(abstractC14971l5);
                                                }
                                            }
                                        }
                                        if (i5 == 1) {
                                        }
                                    }
                                    abstractC14971lLoadAd2 = AbstractC5573l.loadAd(c17893l4);
                                }
                                break;
                            }
                            abstractC14971lLoadAd2 = abstractC14971lLoadAd2.f29460l;
                        }
                    }
                }
            }
        }
    }
}
