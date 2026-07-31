package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import ua.itaysonlab.vkapi2.internal.objects.VKError;
import ua.itaysonlab.vkapi2.internal.objects.VKResponse;
import ua.itaysonlab.vkapi2.internal.objects.VKResponseWithItems;
import ua.itaysonlab.vkx.VKXApplication;

/* JADX INFO: renamed from: lًٟۨ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC8189l {
    public final C8688l amazon;
    public int crashlytics;
    public String loadAd;
    public final HashMap purchase;
    public final Type yandex;

    public AbstractC8189l(Type type) {
        this.yandex = type;
        C8688l c8688l = C10328l.purchase;
        this.loadAd = AbstractC10409l.crashlytics().amazon.ads();
        this.amazon = new C8688l(new C9636l(20, this));
        this.purchase = new HashMap();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static Object admob(AbstractC8189l abstractC8189l, InterfaceC14029l interfaceC14029l) {
        C12314l c12314l;
        if (interfaceC14029l instanceof C12314l) {
            c12314l = (C12314l) interfaceC14029l;
            int i = c12314l.f24399l;
            if ((i & RecyclerView.UNDEFINED_DURATION) != 0) {
                c12314l.f24399l = i - RecyclerView.UNDEFINED_DURATION;
            } else {
                c12314l = new C12314l(abstractC8189l, interfaceC14029l);
            }
        } else {
            c12314l = new C12314l(abstractC8189l, interfaceC14029l);
        }
        Object objCrashlytics = c12314l.f24398l;
        int i2 = c12314l.f24399l;
        if (i2 == 0) {
            AbstractC2829l.crashlytics(objCrashlytics);
            AbstractC7188l abstractC7188lYandex = VKXApplication.f36629l.yandex(AbstractC15639l.mopub(VKResponse.class, abstractC8189l.yandex));
            c12314l.f24399l = 1;
            objCrashlytics = crashlytics(abstractC8189l, abstractC7188lYandex, c12314l);
            EnumC9342l enumC9342l = EnumC9342l.f19165l;
            if (objCrashlytics == enumC9342l) {
                return enumC9342l;
            }
        } else {
            if (i2 != 1) {
                C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC2829l.crashlytics(objCrashlytics);
        }
        return ((VKResponse) objCrashlytics).yandex;
    }

    public static void billing(C16534l c16534l, Function1 function1) {
        C10351l c10351l = new C10351l(9);
        C1412l c1412l = new C1412l(12, c16534l);
        C0786l c0786l = new C0786l(1, function1);
        VKXApplication vKXApplication = VKXApplication.f36631l;
        if (vKXApplication == null) {
            vKXApplication = null;
        }
        AbstractC10999l.mopub(vKXApplication, null, 0, new C0469l(c0786l, c16534l, c10351l, c1412l, (InterfaceC14029l) null), 3);
    }

    public static Object crashlytics(AbstractC8189l abstractC8189l, AbstractC7188l abstractC7188l, AbstractC0283l abstractC0283l) {
        return abstractC8189l.loadAd(new C10351l(8), new C1412l(11, abstractC7188l), abstractC0283l);
    }

    public static void purchase(AbstractC8189l abstractC8189l) {
        VKXApplication vKXApplication = VKXApplication.f36631l;
        InterfaceC14029l interfaceC14029l = null;
        if (vKXApplication == null) {
            vKXApplication = null;
        }
        AbstractC10999l.mopub(vKXApplication, null, 0, new C5163l(abstractC8189l, interfaceC14029l, interfaceC14029l, 11), 3);
    }

    public static final Object yandex(AbstractC8189l abstractC8189l, AbstractC5563l abstractC5563l) {
        return AbstractC16584l.loadAd().mopub(abstractC8189l.isPro() + '.' + abstractC8189l.firebase(), false, "5.272", abstractC8189l.purchase, C14054l.f27396l, abstractC8189l.loadAd, true, abstractC5563l);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object adcel(AbstractC0283l abstractC0283l) {
        C10229l c10229l;
        if (abstractC0283l instanceof C10229l) {
            c10229l = (C10229l) abstractC0283l;
            int i = c10229l.f20851l;
            if ((i & RecyclerView.UNDEFINED_DURATION) != 0) {
                c10229l.f20851l = i - RecyclerView.UNDEFINED_DURATION;
            } else {
                c10229l = new C10229l(this, abstractC0283l);
            }
        } else {
            c10229l = new C10229l(this, abstractC0283l);
        }
        Object obj = c10229l.f20850l;
        int i2 = c10229l.f20851l;
        try {
            if (i2 != 0) {
                if (i2 == 1) {
                    AbstractC2829l.crashlytics(obj);
                    return obj;
                }
                C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC2829l.crashlytics(obj);
            c10229l.f20851l = 1;
            Object objMopub = mopub(c10229l);
            Object obj2 = EnumC9342l.f19165l;
            return objMopub == obj2 ? obj2 : objMopub;
        } catch (Exception unused) {
            return null;
        }
    }

    public final Object ads(InterfaceC14029l interfaceC14029l) throws Throwable {
        C16552l c16552l = AbstractC11463l.yandex;
        Object objFirebase = AbstractC10999l.firebase(ExecutorC6708l.f14063l, new C11039l(this, null, 7), interfaceC14029l);
        return objFirebase == EnumC9342l.f19165l ? objFirebase : Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object amazon(Function1 function1, AbstractC0283l abstractC0283l) throws Throwable {
        C18519l c18519l;
        if (abstractC0283l instanceof C18519l) {
            c18519l = (C18519l) abstractC0283l;
            int i = c18519l.f36147l;
            if ((i & RecyclerView.UNDEFINED_DURATION) != 0) {
                c18519l.f36147l = i - RecyclerView.UNDEFINED_DURATION;
            } else {
                c18519l = new C18519l(this, abstractC0283l);
            }
        } else {
            c18519l = new C18519l(this, abstractC0283l);
        }
        Object objFirebase = c18519l.f36146l;
        int i2 = c18519l.f36147l;
        InterfaceC14029l interfaceC14029l = null;
        if (i2 == 0) {
            AbstractC2829l.crashlytics(objFirebase);
            C16552l c16552l = AbstractC11463l.yandex;
            ExecutorC6708l executorC6708l = ExecutorC6708l.f14063l;
            C5163l c5163l = new C5163l(this, function1, interfaceC14029l, 10);
            c18519l.f36147l = 1;
            objFirebase = AbstractC10999l.firebase(executorC6708l, c5163l, c18519l);
            EnumC9342l enumC9342l = EnumC9342l.f19165l;
            if (objFirebase == enumC9342l) {
                return enumC9342l;
            }
        } else {
            if (i2 != 1) {
                C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC2829l.crashlytics(objFirebase);
        }
        if (objFirebase instanceof VKResponse) {
            VKResponse vKResponse = (VKResponse) objFirebase;
            VKError vKError = vKResponse.loadAd;
            List list = vKResponse.crashlytics;
            C8688l c8688l = this.amazon;
            if (list != null && !list.isEmpty()) {
                throw new C13661l((String) c8688l.getValue(), list);
            }
            if (vKError != null) {
                throw new C13661l((String) c8688l.getValue(), vKError);
            }
            if (vKResponse.yandex == null) {
                throw new C13661l((String) c8688l.getValue(), new VKError(-1, "Response is null", null, null, null, null, null, null, null, null, 1008));
            }
        }
        return objFirebase;
    }

    public abstract String firebase();

    public abstract String isPro();

    /* JADX WARN: Can't wrap try/catch for region: R(3:45|24|(1:32)(1:27)) */
    /* JADX WARN: Code duplicated, block: B:36:0x0084  */
    /* JADX WARN: Code duplicated, block: B:37:0x008c  */
    /* JADX WARN: Code duplicated, block: B:39:0x008f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:40:0x0091  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0061, code lost:
    
        r10 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0062, code lost:
    
        r10 = r8;
        r8 = r10;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x0077 -> B:13:0x0033). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object loadAd(kotlin.jvm.functions.Function1 r8, kotlin.jvm.functions.Function1 r9, defpackage.AbstractC0283l r10) throws java.lang.Throwable {
        /*
            r7 = this;
            boolean r0 = r10 instanceof defpackage.C2210l
            if (r0 == 0) goto L13
            r0 = r10
            lۣؓٓ r0 = (defpackage.C2210l) r0
            int r1 = r0.f4883l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f4883l = r1
            goto L18
        L13:
            lۣؓٓ r0 = new lۣؓٓ
            r0.<init>(r7, r10)
        L18:
            java.lang.Object r10 = r0.f4879l
            int r1 = r0.f4883l
            r2 = 2
            r3 = 1
            r4 = 0
            lٍؗؐ r5 = defpackage.EnumC9342l.f19165l
            if (r1 == 0) goto L49
            if (r1 == r3) goto L3b
            if (r1 != r2) goto L35
            java.lang.Exception r8 = r0.f4884l
            kotlin.jvm.functions.Function1 r9 = r0.f4881l
            kotlin.jvm.functions.Function1 r1 = r0.f4882l
            defpackage.AbstractC2829l.crashlytics(r10)
            r6 = r0
            r0 = r8
            r8 = r1
        L33:
            r1 = r6
            goto L7c
        L35:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.C8339l.smaato(r7)
            return r4
        L3b:
            kotlin.jvm.functions.Function1 r8 = r0.f4881l
            kotlin.jvm.functions.Function1 r9 = r0.f4882l
            defpackage.AbstractC2829l.crashlytics(r10)     // Catch: java.lang.Exception -> L43
            return r10
        L43:
            r10 = move-exception
            r6 = r9
            r9 = r8
            r8 = r10
            r10 = r6
            goto L65
        L49:
            defpackage.AbstractC2829l.crashlytics(r10)
            r10 = r4
        L4d:
            int r1 = r7.crashlytics
            if (r1 > r2) goto L8d
            r0.f4882l = r8     // Catch: java.lang.Exception -> L61
            r0.f4881l = r9     // Catch: java.lang.Exception -> L61
            r0.f4884l = r4     // Catch: java.lang.Exception -> L61
            r0.f4883l = r3     // Catch: java.lang.Exception -> L61
            java.lang.Object r7 = r7.amazon(r9, r0)     // Catch: java.lang.Exception -> L61
            if (r7 != r5) goto L60
            goto L76
        L60:
            return r7
        L61:
            r10 = move-exception
            r6 = r10
            r10 = r8
            r8 = r6
        L65:
            r8.printStackTrace()
            r0.f4882l = r10
            r0.f4881l = r9
            r0.f4884l = r8
            r0.f4883l = r2
            java.lang.Object r1 = r7.smaato(r8, r0)
            if (r1 != r5) goto L77
        L76:
            return r5
        L77:
            r6 = r0
            r0 = r8
            r8 = r10
            r10 = r1
            goto L33
        L7c:
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r10 = r10.booleanValue()
            if (r10 != 0) goto L8c
            int r10 = r7.crashlytics
            int r10 = r10 + r3
            r7.crashlytics = r10
            r10 = r0
            r0 = r1
            goto L4d
        L8c:
            r10 = r0
        L8d:
            if (r8 == 0) goto L99
            if (r10 != 0) goto L96
            java.lang.NullPointerException r10 = new java.lang.NullPointerException
            r10.<init>()
        L96:
            r8.invoke(r10)
        L99:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC8189l.loadAd(kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, lّؑۧ):java.lang.Object");
    }

    public final void metrica(String str, boolean z) {
        vip(str, z ? "1" : "0");
    }

    public Object mopub(AbstractC0283l abstractC0283l) {
        return admob(this, abstractC0283l);
    }

    public final void remoteconfig(Integer num, String str) {
        vip(str, num != null ? num.toString() : null);
    }

    /* JADX WARN: Code duplicated, block: B:107:0x0259  */
    /* JADX WARN: Code duplicated, block: B:130:0x02d0  */
    /* JADX WARN: Code duplicated, block: B:132:0x02d7  */
    /* JADX WARN: Code duplicated, block: B:151:0x0328 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:172:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:54:0x01a1  */
    /* JADX WARN: Code duplicated, block: B:57:0x01b5  */
    /* JADX WARN: Code duplicated, block: B:60:0x01c0 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Code duplicated, block: B:82:0x0205  */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x024a, code lost:
    
        if (r2 == r11) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x01f7, code lost:
    
        if (r2 == r11) goto L51;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object smaato(java.lang.Exception r24, defpackage.AbstractC0283l r25) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 868
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC8189l.smaato(java.lang.Exception, lّؑۧ):java.lang.Object");
    }

    public final void startapp(String str, Long l) {
        vip(str, l.toString());
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object subs(AbstractC0283l abstractC0283l) {
        C13776l c13776l;
        if (abstractC0283l instanceof C13776l) {
            c13776l = (C13776l) abstractC0283l;
            int i = c13776l.f26890l;
            if ((i & RecyclerView.UNDEFINED_DURATION) != 0) {
                c13776l.f26890l = i - RecyclerView.UNDEFINED_DURATION;
            } else {
                c13776l = new C13776l(this, abstractC0283l);
            }
        } else {
            c13776l = new C13776l(this, abstractC0283l);
        }
        Object objCrashlytics = c13776l.f26889l;
        int i2 = c13776l.f26890l;
        if (i2 == 0) {
            AbstractC2829l.crashlytics(objCrashlytics);
            AbstractC7188l abstractC7188lYandex = VKXApplication.f36629l.yandex(AbstractC15639l.mopub(VKResponse.class, AbstractC15639l.mopub(VKResponseWithItems.class, this.yandex)));
            c13776l.f26890l = 1;
            objCrashlytics = crashlytics(this, abstractC7188lYandex, c13776l);
            EnumC9342l enumC9342l = EnumC9342l.f19165l;
            if (objCrashlytics == enumC9342l) {
                return enumC9342l;
            }
        } else {
            if (i2 != 1) {
                C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC2829l.crashlytics(objCrashlytics);
        }
        return ((VKResponse) objCrashlytics).yandex;
    }

    public final void vip(String str, String str2) {
        if (str2 == null || str2.length() == 0) {
            return;
        }
        this.purchase.put(str, str2);
    }
}
