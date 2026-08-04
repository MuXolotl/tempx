package defpackage;

import android.content.Context;
import android.util.Log;
import android.util.LongSparseArray;
import android.view.KeyEvent;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: lٖٖۧ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC16422l {
    public static boolean admob;
    public static boolean amazon;
    public static boolean billing;
    public static Class crashlytics;
    public static boolean loadAd;
    public static Field mopub;
    public static Field purchase;
    public static Field yandex;

    /* JADX WARN: Code restructure failed: missing block: B:5:0x0008, code lost:
    
        if ((r2 instanceof defpackage.C1617l) != false) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final defpackage.EnumC4164l admob(defpackage.AbstractC11876l r2, android.content.Context r3) {
        /*
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 31
            if (r0 < r1) goto Lb
            boolean r2 = r2 instanceof defpackage.C1617l
            if (r2 == 0) goto L1a
            goto L28
        Lb:
            lًِٖ r2 = defpackage.AbstractC5267l.purchase(r2, r3)
            boolean r3 = r2 instanceof defpackage.C9402l
            if (r3 == 0) goto L16
            lؖٗؒ r2 = defpackage.EnumC4164l.EXACT
            return r2
        L16:
            boolean r3 = r2 instanceof defpackage.C10365l
            if (r3 == 0) goto L1d
        L1a:
            lؖٗؒ r2 = defpackage.EnumC4164l.WRAP
            return r2
        L1d:
            boolean r3 = r2 instanceof defpackage.C16589l
            if (r3 == 0) goto L24
            lؖٗؒ r2 = defpackage.EnumC4164l.FILL
            return r2
        L24:
            boolean r2 = r2 instanceof defpackage.C1617l
            if (r2 == 0) goto L2b
        L28:
            lؖٗؒ r2 = defpackage.EnumC4164l.EXPAND
            return r2
        L2b:
            java.lang.String r2 = "After resolution, no other type should be present"
            defpackage.C8339l.smaato(r2)
            r2 = 0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC16422l.admob(lًِٖ, android.content.Context):lؖٗؒ");
    }

    public static final long amazon(KeyEvent keyEvent) {
        return AbstractC0593l.yandex(keyEvent.getKeyCode());
    }

    public static final String billing(int i) {
        return AbstractC0653l.vip(i, "appWidgetLayout-");
    }

    public static void crashlytics(Object obj) {
        LongSparseArray longSparseArray;
        if (!amazon) {
            try {
                crashlytics = Class.forName("android.content.res.ThemedResourceCache");
            } catch (ClassNotFoundException e) {
                Log.e("ResourcesFlusher", "Could not find ThemedResourceCache class", e);
            }
            amazon = true;
        }
        Class cls = crashlytics;
        if (cls == null) {
            return;
        }
        if (!billing) {
            try {
                Field declaredField = cls.getDeclaredField("mUnthemedEntries");
                purchase = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e2) {
                Log.e("ResourcesFlusher", "Could not retrieve ThemedResourceCache#mUnthemedEntries field", e2);
            }
            billing = true;
        }
        Field field = purchase;
        if (field == null) {
            return;
        }
        try {
            longSparseArray = (LongSparseArray) field.get(obj);
        } catch (IllegalAccessException e3) {
            Log.e("ResourcesFlusher", "Could not retrieve value from ThemedResourceCache#mUnthemedEntries", e3);
            longSparseArray = null;
        }
        if (longSparseArray != null) {
            longSparseArray.clear();
        }
    }

    public static final EnumC0982l isPro(int i) {
        if (i == 0) {
            return EnumC0982l.START;
        }
        if (i == 1) {
            return EnumC0982l.CENTER_HORIZONTALLY;
        }
        if (i == 2) {
            return EnumC0982l.END;
        }
        C11983l.advert(C12347l.loadAd(i), "unknown horizontal alignment ");
        return null;
    }

    public static final C7300l loadAd(Context context, InterfaceC9708l interfaceC9708l) {
        EnumC12675l enumC12675l;
        EnumC13522l enumC13522l;
        C3611l c3611lSignatures = C7300l.signatures();
        if (interfaceC9708l instanceof C5500l) {
            enumC12675l = EnumC12675l.BOX;
        } else if (interfaceC9708l instanceof C10761l) {
            enumC12675l = AbstractC12098l.purchase(((C10761l) interfaceC9708l).crashlytics) ? EnumC12675l.RADIO_ROW : EnumC12675l.ROW;
        } else if (interfaceC9708l instanceof C3480l) {
            enumC12675l = AbstractC12098l.purchase(((C3480l) interfaceC9708l).crashlytics) ? EnumC12675l.RADIO_COLUMN : EnumC12675l.COLUMN;
        } else if (interfaceC9708l instanceof C6958l) {
            enumC12675l = EnumC12675l.TEXT;
        } else if (interfaceC9708l instanceof C13074l) {
            enumC12675l = EnumC12675l.IMAGE;
        } else if (interfaceC9708l instanceof C14524l) {
            enumC12675l = EnumC12675l.REMOTE_VIEWS_ROOT;
        } else {
            if (!(interfaceC9708l instanceof C0032l)) {
                C18262l.startapp(interfaceC9708l.getClass().getCanonicalName(), "Unknown element type ");
                return null;
            }
            enumC12675l = EnumC12675l.SIZE_BOX;
        }
        c3611lSignatures.crashlytics();
        C7300l.vip((C7300l) c3611lSignatures.f16394l, enumC12675l);
        C8079l c8079l = (C8079l) interfaceC9708l.loadAd().purchase(null, C15460l.f30248l);
        AbstractC11876l abstractC11876l = C10365l.yandex;
        EnumC4164l enumC4164lAdmob = admob(c8079l != null ? c8079l.yandex : abstractC11876l, context);
        c3611lSignatures.crashlytics();
        C7300l.metrica((C7300l) c3611lSignatures.f16394l, enumC4164lAdmob);
        C4538l c4538l = (C4538l) interfaceC9708l.loadAd().purchase(null, C15460l.f30255l);
        if (c4538l != null) {
            abstractC11876l = c4538l.yandex;
        }
        EnumC4164l enumC4164lAdmob2 = admob(abstractC11876l, context);
        c3611lSignatures.crashlytics();
        C7300l.startapp((C7300l) c3611lSignatures.f16394l, enumC4164lAdmob2);
        boolean z = interfaceC9708l.loadAd().purchase(null, C15460l.f30229l) != null;
        c3611lSignatures.crashlytics();
        C7300l.Signature((C7300l) c3611lSignatures.f16394l, z);
        if (interfaceC9708l.loadAd().purchase(null, C15460l.f30242l) != null) {
            c3611lSignatures.crashlytics();
            C7300l.tapsense((C7300l) c3611lSignatures.f16394l);
        }
        if (interfaceC9708l instanceof C13074l) {
            C13074l c13074l = (C13074l) interfaceC9708l;
            int i = c13074l.purchase;
            if (i == 1) {
                enumC13522l = EnumC13522l.FIT;
            } else if (i == 0) {
                enumC13522l = EnumC13522l.CROP;
            } else {
                if (i != 2) {
                    C11983l.advert(C0219l.yandex(c13074l.purchase), "Unknown content scale ");
                    return null;
                }
                enumC13522l = EnumC13522l.FILL_BOUNDS;
            }
            c3611lSignatures.crashlytics();
            C7300l.subscription((C7300l) c3611lSignatures.f16394l, enumC13522l);
            boolean z2 = !C10053l.billing(c13074l);
            c3611lSignatures.crashlytics();
            C7300l.pro((C7300l) c3611lSignatures.f16394l, z2);
            boolean z3 = c13074l.crashlytics != null;
            c3611lSignatures.crashlytics();
            C7300l.ad((C7300l) c3611lSignatures.f16394l, z3);
            boolean z4 = c13074l.amazon != null;
            c3611lSignatures.crashlytics();
            C7300l.advert((C7300l) c3611lSignatures.f16394l, z4);
        } else if (interfaceC9708l instanceof C3480l) {
            EnumC0982l enumC0982lIsPro = isPro(((C3480l) interfaceC9708l).purchase);
            c3611lSignatures.crashlytics();
            C7300l.adcel((C7300l) c3611lSignatures.f16394l, enumC0982lIsPro);
        } else if (interfaceC9708l instanceof C10761l) {
            EnumC17543l enumC17543lSubs = subs(((C10761l) interfaceC9708l).purchase);
            c3611lSignatures.crashlytics();
            C7300l.ads((C7300l) c3611lSignatures.f16394l, enumC17543lSubs);
        } else if (interfaceC9708l instanceof C5500l) {
            C5500l c5500l = (C5500l) interfaceC9708l;
            EnumC0982l enumC0982lIsPro2 = isPro(c5500l.amazon.yandex);
            c3611lSignatures.crashlytics();
            C7300l.adcel((C7300l) c3611lSignatures.f16394l, enumC0982lIsPro2);
            EnumC17543l enumC17543lSubs2 = subs(c5500l.amazon.loadAd);
            c3611lSignatures.crashlytics();
            C7300l.ads((C7300l) c3611lSignatures.f16394l, enumC17543lSubs2);
        }
        if (interfaceC9708l instanceof AbstractC11563l) {
            ArrayList arrayList = ((AbstractC11563l) interfaceC9708l).loadAd;
            ArrayList arrayList2 = new ArrayList(AbstractC14055l.billing(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(loadAd(context, (InterfaceC9708l) it.next()));
            }
            c3611lSignatures.crashlytics();
            C7300l.license((C7300l) c3611lSignatures.f16394l, arrayList2);
        }
        return (C7300l) c3611lSignatures.yandex();
    }

    public static final InterfaceC17242l mopub(InterfaceC17242l interfaceC17242l, InterfaceC12499l interfaceC12499l, C17110l c17110l) {
        return interfaceC17242l.premium(new C0110l(interfaceC12499l, c17110l));
    }

    public static final int purchase(KeyEvent keyEvent) {
        int action = keyEvent.getAction();
        if (action != 0) {
            return action != 1 ? 0 : 1;
        }
        return 2;
    }

    public static final EnumC17543l subs(int i) {
        if (i == 0) {
            return EnumC17543l.TOP;
        }
        if (i == 1) {
            return EnumC17543l.CENTER_VERTICALLY;
        }
        if (i == 2) {
            return EnumC17543l.BOTTOM;
        }
        C11983l.advert(C15667l.loadAd(i), "unknown vertical alignment ");
        return null;
    }

    public static int yandex(int i) {
        if (i == 0) {
            return 0;
        }
        if (i == 90) {
            return 1;
        }
        if (i == 180) {
            return 2;
        }
        if (i == 270) {
            return 3;
        }
        C8339l.metrica(AbstractC0653l.vip(i, "Invalid rotation: "));
        return 0;
    }
}
