package defpackage;

import android.webkit.MimeTypeMap;
import androidx.recyclerview.widget.RecyclerView;
import java.io.IOException;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Unit;

/* JADX INFO: renamed from: lٌٓؕ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C13920l implements InterfaceC14142l {
    public final C8688l amazon;
    public final C10933l billing;
    public final InterfaceC1220l crashlytics;
    public final C15106l loadAd;
    public final InterfaceC1220l mopub;
    public final InterfaceC1220l purchase;
    public final String yandex;

    public C13920l(String str, C15106l c15106l, C8688l c8688l, C8688l c8688l2, C8688l c8688l3, C10933l c10933l, C8688l c8688l4) {
        this.yandex = str;
        this.loadAd = c15106l;
        this.crashlytics = c8688l;
        this.amazon = c8688l2;
        this.purchase = c8688l3;
        this.billing = c10933l;
        this.mopub = c8688l4;
    }

    public static void admob(C5507l c5507l) {
        int i = c5507l.yandex;
        if ((200 > i || i >= 300) && i != 304) {
            throw new C6451l(AbstractC0653l.vip(i, "HTTP "), 5, (byte) 0);
        }
    }

    /* JADX WARN: Code duplicated, block: B:133:0x0268  */
    /* JADX WARN: Code duplicated, block: B:159:0x0262 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:161:0x0258 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:77:0x01c9  */
    /* JADX WARN: Code duplicated, block: B:7:0x0020  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v24 */
    /* JADX WARN: Type inference failed for: r11v10, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r11v11 */
    /* JADX WARN: Type inference failed for: r11v12 */
    /* JADX WARN: Type inference failed for: r11v14 */
    /* JADX WARN: Type inference failed for: r11v15 */
    public static final Object amazon(C13920l c13920l, C11352l c11352l, C5507l c5507l, C5507l c5507l2, AbstractC0283l abstractC0283l) throws Exception {
        C2447l c2447l;
        C5507l c5507l3;
        C7026l c7026l;
        C7026l c7026l2;
        ?? th;
        ?? r11;
        C11919l c11919lBilling;
        C3640l c3640l;
        C3640l c3640l2;
        C11352l c11352l2 = c11352l;
        C5507l c5507l4 = c5507l2;
        c13920l.getClass();
        if (abstractC0283l instanceof C2447l) {
            c2447l = (C2447l) abstractC0283l;
            int i = c2447l.f5233l;
            if ((i & RecyclerView.UNDEFINED_DURATION) != 0) {
                c2447l.f5233l = i - RecyclerView.UNDEFINED_DURATION;
            } else {
                c2447l = new C2447l(c13920l, abstractC0283l);
            }
        } else {
            c2447l = new C2447l(c13920l, abstractC0283l);
        }
        Object c0021l = c2447l.f5229l;
        EnumC9342l enumC9342l = EnumC9342l.f19165l;
        int i2 = c2447l.f5233l;
        C7026l c7026l3 = null;
        if (i2 == 0) {
            AbstractC2829l.crashlytics(c0021l);
            if (!AbstractC14814l.mopub(c13920l.loadAd.admob)) {
                if (c11352l2 == null) {
                    return null;
                }
                try {
                    AbstractC12589l.m3425synchronized(c11352l2);
                } catch (RuntimeException e) {
                    throw e;
                } catch (Exception unused) {
                }
                return null;
            }
            InterfaceC1830l interfaceC1830l = (InterfaceC1830l) c13920l.purchase.getValue();
            c2447l.f5232l = c11352l2;
            c2447l.f5231l = c5507l4;
            c2447l.f5233l = 1;
            ((C11600l) interfaceC1830l).getClass();
            int i3 = c5507l4.yandex;
            if (i3 != 304 || c5507l == null) {
                c0021l = ((200 > i3 || i3 >= 300) && !C11600l.loadAd.contains(new Integer(i3))) ? C0021l.loadAd : new C0021l(c5507l4);
            } else {
                C6952l c6952l = c5507l.amazon;
                C6952l c6952l2 = c5507l4.amazon;
                c6952l.getClass();
                Map map = c6952l.yandex;
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Map.Entry entry : map.entrySet()) {
                    linkedHashMap.put(entry.getKey(), new ArrayList((Collection) entry.getValue()));
                }
                for (Map.Entry entry2 : c6952l2.yandex.entrySet()) {
                    linkedHashMap.put(((String) entry2.getKey()).toLowerCase(Locale.ROOT), new ArrayList((List) entry2.getValue()));
                }
                c0021l = new C0021l(new C5507l(c5507l4.yandex, c5507l4.loadAd, c5507l4.crashlytics, new C6952l(AbstractC8676l.tapsense(linkedHashMap)), null, c5507l4.billing));
            }
            if (c0021l == enumC9342l) {
                return enumC9342l;
            }
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                c7026l2 = c2447l.f5234l;
                c5507l3 = c2447l.f5231l;
                c5507l4 = (C5507l) c2447l.f5232l;
                try {
                    AbstractC2829l.crashlytics(c0021l);
                    return c7026l2.ads();
                } catch (Exception e2) {
                    e = e2;
                    try {
                        ((C11919l) c7026l2.f14720l).amazon(false);
                    } catch (Exception unused2) {
                    }
                    c3640l = c5507l4.purchase;
                    if (c3640l != null) {
                        try {
                            AbstractC12589l.m3425synchronized(c3640l);
                        } catch (RuntimeException e3) {
                            throw e3;
                        } catch (Exception unused3) {
                        }
                    }
                    c3640l2 = c5507l3.purchase;
                    if (c3640l2 != null) {
                        throw e;
                    }
                    try {
                        AbstractC12589l.m3425synchronized(c3640l2);
                        throw e;
                    } catch (RuntimeException e4) {
                        throw e4;
                    } catch (Exception unused4) {
                        throw e;
                    }
                }
            }
            C5507l c5507l5 = c2447l.f5231l;
            C11352l c11352l3 = (C11352l) c2447l.f5232l;
            AbstractC2829l.crashlytics(c0021l);
            c5507l4 = c5507l5;
            c11352l2 = c11352l3;
            c7026l3 = null;
        }
        c5507l3 = ((C0021l) c0021l).yandex;
        if (c5507l3 == null) {
            return c7026l3;
        }
        int i4 = 18;
        if (c11352l2 != null) {
            C10946l c10946l = c11352l2.f22897l;
            C5613l c5613l = c10946l.f22074l;
            synchronized (c5613l.f11920l) {
                c10946l.close();
                c11919lBilling = c5613l.billing(c10946l.f22076l.yandex);
            }
            if (c11919lBilling != null) {
                c7026l = new C7026l(i4, c11919lBilling);
            } else {
                c7026l = c7026l3;
            }
        } else {
            C6109l c6109l = (C6109l) c13920l.amazon.getValue();
            if (c6109l == null) {
                c7026l = c7026l3;
            } else {
                String str = c13920l.loadAd.purchase;
                if (str == null) {
                    str = c13920l.yandex;
                }
                C5613l c5613l2 = c6109l.loadAd;
                byte[] bytes = str.getBytes(AbstractC9050l.yandex);
                MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
                messageDigest.update(bytes, 0, bytes.length);
                byte[] bArrDigest = messageDigest.digest();
                char[] cArr = new char[bArrDigest.length * 2];
                int i5 = 0;
                for (byte b : bArrDigest) {
                    int i6 = i5 + 1;
                    char[] cArr2 = AbstractC2632l.loadAd;
                    cArr[i5] = cArr2[(b >> 4) & 15];
                    i5 += 2;
                    cArr[i6] = cArr2[b & 15];
                }
                C11919l c11919lBilling2 = c5613l2.billing(new String(cArr));
                if (c11919lBilling2 != null) {
                    c7026l = new C7026l(i4, c11919lBilling2);
                } else {
                    c7026l = c7026l3;
                }
            }
        }
        if (c7026l == null) {
            return c7026l3;
        }
        try {
            C7167l c7167l = new C7167l(c13920l.purchase().mo691continue(((C11919l) c7026l.f14720l).mopub(0), false));
            try {
                AbstractC9307l.admob(c5507l3, c7167l);
                Unit unit = Unit.INSTANCE;
                try {
                    c7167l.close();
                    th = c7026l3;
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (Throwable th3) {
                try {
                    c7167l.close();
                } catch (Throwable th4) {
                    AbstractC11718l.yandex(th3, th4);
                }
                th = th3;
            }
            if (th != 0) {
                throw th;
            }
            C3640l c3640l3 = c5507l3.purchase;
            if (c3640l3 != null) {
                AbstractC5921l abstractC5921lPurchase = c13920l.purchase();
                C14025l c14025lMopub = ((C11919l) c7026l.f14720l).mopub(1);
                c2447l.f5232l = c5507l4;
                c2447l.f5231l = c5507l3;
                c2447l.f5234l = c7026l;
                c2447l.f5233l = 2;
                InterfaceC9473l interfaceC9473l = c3640l3.f7619l;
                C7167l c7167l2 = new C7167l(abstractC5921lPurchase.mo691continue(c14025lMopub, false));
                try {
                    AbstractC15300l.crashlytics(interfaceC9473l.mo701catch(c7167l2));
                    try {
                        c7167l2.close();
                        r11 = c7026l3;
                    } catch (Throwable th5) {
                        r11 = th5;
                    }
                } catch (Throwable th6) {
                    Throwable th7 = th6;
                    try {
                        c7167l2.close();
                        r11 = th7;
                    } catch (Throwable th8) {
                        AbstractC11718l.yandex(th7, th8);
                        r11 = th7;
                    }
                }
                if (r11 != 0) {
                    throw r11;
                }
                if (Unit.INSTANCE == enumC9342l) {
                    return enumC9342l;
                }
            }
            c7026l2 = c7026l;
            return c7026l2.ads();
        } catch (Exception e5) {
            e = e5;
            c7026l2 = c7026l;
            ((C11919l) c7026l2.f14720l).amazon(false);
            c3640l = c5507l4.purchase;
            if (c3640l != null) {
                AbstractC12589l.m3425synchronized(c3640l);
            }
            c3640l2 = c5507l3.purchase;
            if (c3640l2 != null) {
                throw e;
            }
            AbstractC12589l.m3425synchronized(c3640l2);
            throw e;
        }
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0012  */
    public static String billing(String str, String str2) {
        String mimeTypeFromExtension;
        if (str2 == null || AbstractC16648l.isVip(str2, "text/plain", false)) {
            if (AbstractC12024l.m3315catch(str)) {
                mimeTypeFromExtension = null;
            } else {
                String strM3317const = AbstractC12024l.m3317const(AbstractC12024l.m3317const(str, '#'), '?');
                String strM3348transient = AbstractC12024l.m3348transient('.', AbstractC12024l.m3348transient('/', strM3317const, strM3317const), "");
                if (AbstractC12024l.m3315catch(strM3348transient)) {
                    mimeTypeFromExtension = null;
                } else {
                    String lowerCase = strM3348transient.toLowerCase(Locale.ROOT);
                    mimeTypeFromExtension = (String) AbstractC10189l.yandex.get(lowerCase);
                    if (mimeTypeFromExtension == null) {
                        mimeTypeFromExtension = MimeTypeMap.getSingleton().getMimeTypeFromExtension(lowerCase);
                    }
                }
            }
            if (mimeTypeFromExtension != null) {
                return mimeTypeFromExtension;
            }
        }
        if (str2 != null) {
            return AbstractC12024l.m3351while(str2, ';');
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static final Object crashlytics(C13920l c13920l, C3640l c3640l, AbstractC0283l abstractC0283l) {
        C11580l c11580l;
        C0869l c0869l;
        c13920l.getClass();
        if (abstractC0283l instanceof C11580l) {
            c11580l = (C11580l) abstractC0283l;
            int i = c11580l.f23268l;
            if ((i & RecyclerView.UNDEFINED_DURATION) != 0) {
                c11580l.f23268l = i - RecyclerView.UNDEFINED_DURATION;
            } else {
                c11580l = new C11580l(c13920l, abstractC0283l);
            }
        } else {
            c11580l = new C11580l(c13920l, abstractC0283l);
        }
        Object obj = c11580l.f23269l;
        int i2 = c11580l.f23268l;
        if (i2 == 0) {
            AbstractC2829l.crashlytics(obj);
            C0869l c0869l2 = new C0869l();
            c11580l.f23270l = c0869l2;
            c11580l.f23268l = 1;
            c3640l.f7619l.mo701catch(c0869l2);
            Unit unit = Unit.INSTANCE;
            EnumC9342l enumC9342l = EnumC9342l.f19165l;
            if (unit == enumC9342l) {
                return enumC9342l;
            }
            c0869l = c0869l2;
        } else {
            if (i2 != 1) {
                C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            c0869l = c11580l.f23270l;
            AbstractC2829l.crashlytics(obj);
        }
        return AbstractC17291l.loadAd(c0869l, c13920l.purchase());
    }

    /* JADX WARN: Code duplicated, block: B:101:0x01e8 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:104:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:47:0x00da A[Catch: Exception -> 0x0117, TryCatch #3 {Exception -> 0x0117, blocks: (B:64:0x0152, B:66:0x0158, B:45:0x00d3, B:47:0x00da, B:49:0x00e8, B:58:0x011b, B:60:0x0127, B:52:0x00fb, B:54:0x0105, B:70:0x0175, B:71:0x017c), top: B:100:0x00d3 }] */
    /* JADX WARN: Code duplicated, block: B:49:0x00e8 A[Catch: Exception -> 0x0117, TryCatch #3 {Exception -> 0x0117, blocks: (B:64:0x0152, B:66:0x0158, B:45:0x00d3, B:47:0x00da, B:49:0x00e8, B:58:0x011b, B:60:0x0127, B:52:0x00fb, B:54:0x0105, B:70:0x0175, B:71:0x017c), top: B:100:0x00d3 }] */
    /* JADX WARN: Code duplicated, block: B:60:0x0127 A[Catch: Exception -> 0x0117, TryCatch #3 {Exception -> 0x0117, blocks: (B:64:0x0152, B:66:0x0158, B:45:0x00d3, B:47:0x00da, B:49:0x00e8, B:58:0x011b, B:60:0x0127, B:52:0x00fb, B:54:0x0105, B:70:0x0175, B:71:0x017c), top: B:100:0x00d3 }] */
    /* JADX WARN: Code duplicated, block: B:62:0x014b  */
    /* JADX WARN: Code duplicated, block: B:63:0x014d  */
    /* JADX WARN: Code duplicated, block: B:66:0x0158 A[Catch: Exception -> 0x0117, TryCatch #3 {Exception -> 0x0117, blocks: (B:64:0x0152, B:66:0x0158, B:45:0x00d3, B:47:0x00da, B:49:0x00e8, B:58:0x011b, B:60:0x0127, B:52:0x00fb, B:54:0x0105, B:70:0x0175, B:71:0x017c), top: B:100:0x00d3 }] */
    /* JADX WARN: Code duplicated, block: B:68:0x0172  */
    /* JADX WARN: Code duplicated, block: B:70:0x0175 A[Catch: Exception -> 0x0117, TryCatch #3 {Exception -> 0x0117, blocks: (B:64:0x0152, B:66:0x0158, B:45:0x00d3, B:47:0x00da, B:49:0x00e8, B:58:0x011b, B:60:0x0127, B:52:0x00fb, B:54:0x0105, B:70:0x0175, B:71:0x017c), top: B:100:0x00d3 }] */
    /* JADX WARN: Code duplicated, block: B:84:0x01c2 A[Catch: Exception -> 0x003d, TryCatch #2 {Exception -> 0x003d, blocks: (B:15:0x0038, B:87:0x01df, B:22:0x0048, B:82:0x01be, B:84:0x01c2, B:72:0x017d, B:74:0x0185, B:77:0x0194, B:78:0x0199, B:79:0x019a), top: B:99:0x002e }] */
    /* JADX WARN: Code duplicated, block: B:8:0x001e  */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x01dc, code lost:
    
        if (r0 == r12) goto L86;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object loadAd(defpackage.C13920l r22, defpackage.InterfaceC14029l r23) throws java.lang.Exception {
        /*
            Method dump skipped, instruction units count: 495
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C13920l.loadAd(lٌٓؕ, lٌؚٓ):java.lang.Object");
    }

    public final C5507l isPro(C11352l c11352l) throws Throwable {
        Throwable th;
        C5507l c5507lPurchase;
        try {
            AbstractC5921l abstractC5921lPurchase = purchase();
            C10946l c10946l = c11352l.f22897l;
            if (c10946l.f22075l) {
                throw new IllegalStateException("snapshot is closed");
            }
            C1503l c1503l = new C1503l(abstractC5921lPurchase.mo692default((C14025l) c10946l.f22076l.crashlytics.get(0)));
            try {
                c5507lPurchase = AbstractC9307l.purchase(c1503l);
                try {
                    c1503l.close();
                    th = null;
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (Throwable th3) {
                try {
                    c1503l.close();
                } catch (Throwable th4) {
                    AbstractC11718l.yandex(th3, th4);
                }
                th = th3;
                c5507lPurchase = null;
            }
            if (th == null) {
                return c5507lPurchase;
            }
            throw th;
        } catch (IOException unused) {
            return null;
        }
    }

    public final C7139l mopub() {
        C16543l c16543l = AbstractC1511l.loadAd;
        C15106l c15106l = this.loadAd;
        Object objAmazon = AbstractC0532l.amazon(c15106l, c16543l);
        int i = c15106l.admob;
        C6952l c6952l = (C6952l) objAmazon;
        c6952l.getClass();
        Map map = c6952l.yandex;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : map.entrySet()) {
            linkedHashMap.put(entry.getKey(), new ArrayList((Collection) entry.getValue()));
        }
        boolean zBilling = AbstractC14814l.billing(i);
        boolean z = AbstractC14814l.billing(c15106l.subs) && ((InterfaceC9974l) this.billing.f22057l).yandex();
        if (!z && zBilling) {
            linkedHashMap.put("Cache-Control".toLowerCase(Locale.ROOT), AbstractC14055l.metrica("only-if-cached, max-stale=2147483647"));
        } else if (!z || zBilling) {
            if (!z && !zBilling) {
                linkedHashMap.put("Cache-Control".toLowerCase(Locale.ROOT), AbstractC14055l.metrica("no-cache, only-if-cached"));
            }
        } else if (AbstractC14814l.mopub(i)) {
            linkedHashMap.put("Cache-Control".toLowerCase(Locale.ROOT), AbstractC14055l.metrica("no-cache"));
        } else {
            linkedHashMap.put("Cache-Control".toLowerCase(Locale.ROOT), AbstractC14055l.metrica("no-cache, no-store"));
        }
        String str = (String) AbstractC0532l.amazon(c15106l, AbstractC1511l.yandex);
        C6952l c6952l2 = new C6952l(AbstractC8676l.tapsense(linkedHashMap));
        if (AbstractC0532l.amazon(c15106l, AbstractC1511l.crashlytics) == null) {
            return new C7139l(this.yandex, str, c6952l2, c15106l.isPro);
        }
        C18725l.loadAd();
        return null;
    }

    public final AbstractC5921l purchase() {
        AbstractC5921l abstractC5921l;
        C6109l c6109l = (C6109l) this.amazon.getValue();
        return (c6109l == null || (abstractC5921l = c6109l.yandex) == null) ? this.loadAd.billing : abstractC5921l;
    }

    public final C16218l subs(C11352l c11352l) {
        C10946l c10946l = c11352l.f22897l;
        if (c10946l.f22075l) {
            C8339l.smaato("snapshot is closed");
            return null;
        }
        C14025l c14025l = (C14025l) c10946l.f22076l.crashlytics.get(1);
        AbstractC5921l abstractC5921lPurchase = purchase();
        String str = this.loadAd.purchase;
        if (str == null) {
            str = this.yandex;
        }
        return AbstractC17291l.yandex(c14025l, abstractC5921lPurchase, str, c11352l, 16);
    }

    @Override // defpackage.InterfaceC14142l
    public final Object yandex(C6563l c6563l) {
        C9147l c9147l = (C9147l) this.mopub.getValue();
        String str = this.loadAd.purchase;
        c9147l.getClass();
        return loadAd(this, c6563l);
    }
}
