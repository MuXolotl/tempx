package defpackage;

import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;
import java.util.LinkedHashMap;
import kotlin.Unit;

/* JADX INFO: renamed from: lٙۚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C18404l {
    public static final LinkedHashMap amazon;
    public static final long crashlytics;
    public static final C4910l purchase;
    public static final C18404l yandex = new C18404l();
    public static final C13047l loadAd = AbstractC9549l.yandex(new C8578l(4));

    static {
        C6760l c6760l = C9658l.f19699l;
        crashlytics = C9658l.amazon(AbstractC15918l.tapsense(1, EnumC16636l.DAYS));
        amazon = new LinkedHashMap();
        purchase = AbstractC8618l.yandex();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object loadAd(String str, AbstractC0283l abstractC0283l) {
        C8734l c8734l;
        C4910l c4910l;
        if (abstractC0283l instanceof C8734l) {
            c8734l = (C8734l) abstractC0283l;
            int i = c8734l.f17979l;
            if ((i & RecyclerView.UNDEFINED_DURATION) != 0) {
                c8734l.f17979l = i - RecyclerView.UNDEFINED_DURATION;
            } else {
                c8734l = new C8734l(this, abstractC0283l);
            }
        } else {
            c8734l = new C8734l(this, abstractC0283l);
        }
        Object obj = c8734l.f17982l;
        int i2 = c8734l.f17979l;
        if (i2 == 0) {
            AbstractC2829l.crashlytics(obj);
            c8734l.f17981l = str;
            c4910l = purchase;
            c8734l.f17980l = c4910l;
            c8734l.f17979l = 1;
            Object objYandex = c4910l.yandex(c8734l);
            EnumC9342l enumC9342l = EnumC9342l.f19165l;
            if (objYandex == enumC9342l) {
                return enumC9342l;
            }
        } else {
            if (i2 != 1) {
                C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            C4910l c4910l2 = c8734l.f17980l;
            String str2 = c8734l.f17981l;
            AbstractC2829l.crashlytics(obj);
            c4910l = c4910l2;
            str = str2;
        }
        try {
            String str3 = (String) amazon.get(str);
            if (str3 == null) {
                str3 = "";
            }
            return str3;
        } finally {
            c4910l.billing(null);
        }
    }

    /* JADX WARN: Code duplicated, block: B:38:0x00b2 A[Catch: all -> 0x0032, TRY_LEAVE, TryCatch #1 {all -> 0x0032, blocks: (B:14:0x002d, B:52:0x00e8, B:36:0x00aa, B:38:0x00b2), top: B:59:0x0023 }] */
    /* JADX WARN: Code duplicated, block: B:41:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:47:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:48:0x00e2 A[Catch: all -> 0x00c0, TRY_LEAVE, TryCatch #0 {all -> 0x00c0, blocks: (B:45:0x00c2, B:48:0x00e2, B:30:0x0074, B:32:0x0088), top: B:57:0x0074 }] */
    /* JADX WARN: Code duplicated, block: B:51:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v0, types: [android.content.Context] */
    /* JADX WARN: Type inference failed for: r14v1, types: [lٍؓؕ] */
    /* JADX WARN: Type inference failed for: r14v12 */
    /* JADX WARN: Type inference failed for: r14v15 */
    /* JADX WARN: Type inference failed for: r14v17 */
    /* JADX WARN: Type inference failed for: r14v2, types: [android.content.Context, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v20 */
    /* JADX WARN: Type inference failed for: r14v21 */
    /* JADX WARN: Type inference failed for: r14v5 */
    /* JADX WARN: Type inference failed for: r14v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v3 */
    public final Object yandex(Context context, AbstractC0283l abstractC0283l) throws Throwable {
        C10051l c10051l;
        InterfaceC1601l interfaceC1601l;
        int i;
        ?? r14;
        long jCurrentTimeMillis;
        long j;
        long j2;
        ?? r9;
        InterfaceC1601l interfaceC1601l2;
        ?? r15;
        Object objFirebase;
        InterfaceC1601l interfaceC1601l3;
        if (abstractC0283l instanceof C10051l) {
            c10051l = (C10051l) abstractC0283l;
            int i2 = c10051l.f20505l;
            if ((i2 & RecyclerView.UNDEFINED_DURATION) != 0) {
                c10051l.f20505l = i2 - RecyclerView.UNDEFINED_DURATION;
            } else {
                c10051l = new C10051l(this, abstractC0283l);
            }
        } else {
            c10051l = new C10051l(this, abstractC0283l);
        }
        Object obj = c10051l.f20502l;
        int i3 = c10051l.f20505l;
        int i4 = 3;
        int i5 = 0;
        InterfaceC14029l interfaceC14029l = null;
        EnumC9342l enumC9342l = EnumC9342l.f19165l;
        try {
            try {
                if (i3 == 0) {
                    AbstractC2829l.crashlytics(obj);
                    c10051l.f20504l = context;
                    interfaceC1601l = purchase;
                    c10051l.f20503l = interfaceC1601l;
                    c10051l.f20507l = 0;
                    c10051l.f20505l = 1;
                    if (interfaceC1601l.yandex(c10051l) != enumC9342l) {
                        i = 0;
                        r14 = context;
                    }
                    return enumC9342l;
                }
                if (i3 == 1) {
                    int i6 = c10051l.f20507l;
                    InterfaceC1601l interfaceC1601l4 = c10051l.f20503l;
                    Context context2 = c10051l.f20504l;
                    AbstractC2829l.crashlytics(obj);
                    i = i6;
                    interfaceC1601l = interfaceC1601l4;
                    r14 = context2;
                } else {
                    if (i3 == 2) {
                        long j3 = c10051l.f20506l;
                        j2 = c10051l.f20501l;
                        i5 = c10051l.f20500l;
                        i = c10051l.f20507l;
                        InterfaceC1601l interfaceC1601l5 = c10051l.f20503l;
                        Context context3 = c10051l.f20504l;
                        try {
                            AbstractC2829l.crashlytics(obj);
                            j = j3;
                            interfaceC1601l2 = interfaceC1601l5;
                            r9 = context3;
                            if (((Boolean) obj).booleanValue()) {
                                Unit unit = Unit.INSTANCE;
                                interfaceC1601l2.billing(null);
                                return unit;
                            }
                            interfaceC1601l = interfaceC1601l2;
                            r15 = r9;
                            jCurrentTimeMillis = j2;
                            c10051l.f20504l = null;
                            c10051l.f20503l = interfaceC1601l;
                            c10051l.f20507l = i;
                            c10051l.f20500l = i5;
                            c10051l.f20501l = jCurrentTimeMillis;
                            c10051l.f20506l = j;
                            c10051l.f20505l = 3;
                            C16552l c16552l = AbstractC11463l.yandex;
                            objFirebase = AbstractC10999l.firebase(ExecutorC6708l.f14063l, new C15556l(r15, interfaceC14029l, 12), c10051l);
                            if (objFirebase != enumC9342l) {
                                objFirebase = Unit.INSTANCE;
                            }
                            if (objFirebase != enumC9342l) {
                                interfaceC1601l3 = interfaceC1601l;
                            }
                            return enumC9342l;
                        } catch (Throwable th) {
                            th = th;
                            context = interfaceC1601l5;
                            context.billing(null);
                            throw th;
                        }
                    }
                    if (i3 != 3) {
                        C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    interfaceC1601l3 = c10051l.f20503l;
                    AbstractC2829l.crashlytics(obj);
                }
                Unit unit2 = Unit.INSTANCE;
                interfaceC1601l3.billing(null);
                return unit2;
                jCurrentTimeMillis = System.currentTimeMillis();
                j = r14.getSharedPreferences("VkxRemoteConfig", 0).getLong("expiresAt", jCurrentTimeMillis);
                r15 = r14;
                if (j > jCurrentTimeMillis) {
                    c10051l.f20504l = r14;
                    c10051l.f20503l = interfaceC1601l;
                    c10051l.f20507l = i;
                    c10051l.f20500l = 0;
                    c10051l.f20501l = jCurrentTimeMillis;
                    c10051l.f20506l = j;
                    c10051l.f20505l = 2;
                    C16552l c16552l2 = AbstractC11463l.yandex;
                    Object objFirebase2 = AbstractC10999l.firebase(ExecutorC6708l.f14063l, new C4781l(r14, interfaceC14029l, i4), c10051l);
                    if (objFirebase2 != enumC9342l) {
                        j2 = jCurrentTimeMillis;
                        r9 = r14;
                        interfaceC1601l2 = interfaceC1601l;
                        obj = objFirebase2;
                        if (((Boolean) obj).booleanValue()) {
                            Unit unit3 = Unit.INSTANCE;
                            interfaceC1601l2.billing(null);
                            return unit3;
                        }
                        interfaceC1601l = interfaceC1601l2;
                        r15 = r9;
                        jCurrentTimeMillis = j2;
                        c10051l.f20504l = null;
                        c10051l.f20503l = interfaceC1601l;
                        c10051l.f20507l = i;
                        c10051l.f20500l = i5;
                        c10051l.f20501l = jCurrentTimeMillis;
                        c10051l.f20506l = j;
                        c10051l.f20505l = 3;
                        C16552l c16552l3 = AbstractC11463l.yandex;
                        objFirebase = AbstractC10999l.firebase(ExecutorC6708l.f14063l, new C15556l(r15, interfaceC14029l, 12), c10051l);
                        if (objFirebase != enumC9342l) {
                            objFirebase = Unit.INSTANCE;
                        }
                        if (objFirebase != enumC9342l) {
                            interfaceC1601l3 = interfaceC1601l;
                            Unit unit4 = Unit.INSTANCE;
                            interfaceC1601l3.billing(null);
                            return unit4;
                        }
                    }
                } else {
                    c10051l.f20504l = null;
                    c10051l.f20503l = interfaceC1601l;
                    c10051l.f20507l = i;
                    c10051l.f20500l = i5;
                    c10051l.f20501l = jCurrentTimeMillis;
                    c10051l.f20506l = j;
                    c10051l.f20505l = 3;
                    C16552l c16552l4 = AbstractC11463l.yandex;
                    objFirebase = AbstractC10999l.firebase(ExecutorC6708l.f14063l, new C15556l(r15, interfaceC14029l, 12), c10051l);
                    if (objFirebase != enumC9342l) {
                        objFirebase = Unit.INSTANCE;
                    }
                    if (objFirebase != enumC9342l) {
                        interfaceC1601l3 = interfaceC1601l;
                        Unit unit5 = Unit.INSTANCE;
                        interfaceC1601l3.billing(null);
                        return unit5;
                    }
                }
                return enumC9342l;
            } catch (Throwable th2) {
                context = interfaceC1601l;
                th = th2;
                context.billing(null);
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }
}
