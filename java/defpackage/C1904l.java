package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import java.io.FileNotFoundException;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: lؓ٘ؗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public class C1904l implements InterfaceC14978l {
    public final C7972l amazon = new C7972l(3);
    public final C15053l crashlytics;
    public final C14025l loadAd;
    public final AbstractC5921l yandex;

    public C1904l(AbstractC5921l abstractC5921l, C14025l c14025l, C15053l c15053l) {
        this.yandex = abstractC5921l;
        this.loadAd = c14025l;
        this.crashlytics = c15053l;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0084 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:107:0x00d9 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:109:0x00ea A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:111:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:56:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:75:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:76:0x00f9 A[Catch: Exception -> 0x00fa, TRY_ENTER, TRY_LEAVE, TryCatch #4 {Exception -> 0x00fa, blocks: (B:76:0x00f9, B:52:0x00b6), top: B:96:0x00b6 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code duplicated, block: B:81:0x0102  */
    /* JADX WARN: Code duplicated, block: B:83:0x0113  */
    /* JADX WARN: Code duplicated, block: B:96:0x00b6 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:98:0x0094 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v19, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r9v25, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r9v31, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r9v34 */
    /* JADX WARN: Type inference failed for: r9v36, types: [java.lang.Throwable] */
    public static Object billing(C1904l c1904l, AbstractC0283l abstractC0283l) throws Exception {
        C15510l c15510l;
        C1904l c1904l2;
        C1503l c1503l;
        Throwable th;
        AbstractC5921l abstractC5921l;
        InterfaceC18477l interfaceC18477l;
        C14025l c14025l;
        C1503l c1503l2;
        C1904l c1904l3;
        C1503l c1503l3;
        if (abstractC0283l instanceof C15510l) {
            c15510l = (C15510l) abstractC0283l;
            int i = c15510l.f30322l;
            if ((i & RecyclerView.UNDEFINED_DURATION) != 0) {
                c15510l.f30322l = i - RecyclerView.UNDEFINED_DURATION;
            } else {
                c15510l = new C15510l(c1904l, abstractC0283l);
            }
        } else {
            c15510l = new C15510l(c1904l, abstractC0283l);
        }
        Object objMo2331l = c15510l.f30318l;
        int i2 = c15510l.f30322l;
        int i3 = 4;
        Object th2 = null;
        EnumC9342l enumC9342l = EnumC9342l.f19165l;
        if (i2 == 0) {
            AbstractC2829l.crashlytics(objMo2331l);
            if (((AtomicBoolean) c1904l.amazon.f16631l).get()) {
                C8339l.smaato("This scope has already been closed.");
                return null;
            }
            try {
                C1503l c1503l4 = new C1503l(c1904l.yandex.mo692default(c1904l.loadAd));
                try {
                    C15053l c15053l = c1904l.crashlytics;
                    c15510l.f30321l = c1904l;
                    c15510l.f30320l = c1503l4;
                    c15510l.f30323l = null;
                    c15510l.f30322l = 1;
                    objMo2331l = ((InterfaceC18477l) c15053l.f29576l).mo2331l(new C11270l(i3, c1503l4));
                    if (objMo2331l != enumC9342l) {
                        c1904l2 = c1904l;
                        c1503l = c1503l4;
                        if (c1503l != null) {
                            c1503l.close();
                        }
                        th = null;
                    }
                    return enumC9342l;
                } catch (Throwable th3) {
                    th = th3;
                    c1904l2 = c1904l;
                    c1503l = c1503l4;
                    if (c1503l != null) {
                        c1503l.close();
                    }
                    th = th;
                    objMo2331l = null;
                }
            } catch (FileNotFoundException unused) {
                abstractC5921l = c1904l.yandex;
                interfaceC18477l = (InterfaceC18477l) c1904l.crashlytics.f29576l;
                c14025l = c1904l.loadAd;
                if (abstractC5921l.isVip(c14025l)) {
                    return interfaceC18477l.mo2330l();
                }
                c1503l2 = new C1503l(c1904l.yandex.mo692default(c14025l));
                c15510l.f30321l = c1904l;
                c15510l.f30320l = null;
                c15510l.f30323l = c1503l2;
                c15510l.f30322l = 2;
                objMo2331l = interfaceC18477l.mo2331l(new C11270l(i3, c1503l2));
                if (objMo2331l != enumC9342l) {
                    c1904l3 = c1904l;
                    c1503l3 = c1503l2;
                    if (c1503l3 != null) {
                        c1503l3.close();
                    }
                    Object obj = th2;
                    th2 = objMo2331l;
                    th = obj;
                    c1904l = c1904l3;
                    if (th == 0) {
                        return th2;
                    }
                    throw th;
                }
            }
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                c1503l3 = c15510l.f30323l;
                c1904l3 = c15510l.f30321l;
                try {
                    AbstractC2829l.crashlytics(objMo2331l);
                    if (c1503l3 != null) {
                        try {
                            c1503l3.close();
                        } catch (Throwable th4) {
                            th2 = th4;
                        }
                    }
                    Object obj2 = th2;
                    th2 = objMo2331l;
                    th = obj2;
                } catch (Throwable th5) {
                    th = th5;
                    if (c1503l3 != null) {
                        try {
                            c1503l3.close();
                        } catch (Throwable th6) {
                            try {
                                AbstractC11718l.yandex(th, th6);
                            } catch (Exception e) {
                                e = e;
                                if (e instanceof FileNotFoundException) {
                                    throw AbstractC11020l.crashlytics(String.valueOf(c1904l3.loadAd.crashlytics()), (FileNotFoundException) e);
                                }
                                throw e;
                            }
                        }
                    }
                }
                c1904l = c1904l3;
                if (th == 0) {
                    return th2;
                }
                throw th;
            }
            c1503l = c15510l.f30320l;
            c1904l2 = c15510l.f30321l;
            try {
                AbstractC2829l.crashlytics(objMo2331l);
                if (c1503l != null) {
                    try {
                        c1503l.close();
                    } catch (Throwable th7) {
                        th = th7;
                    }
                }
                th = null;
            } catch (Throwable th8) {
                th = th8;
                if (c1503l != null) {
                    try {
                        try {
                            c1503l.close();
                        } catch (FileNotFoundException unused2) {
                            c1904l = c1904l2;
                            abstractC5921l = c1904l.yandex;
                            interfaceC18477l = (InterfaceC18477l) c1904l.crashlytics.f29576l;
                            c14025l = c1904l.loadAd;
                            if (abstractC5921l.isVip(c14025l)) {
                                return interfaceC18477l.mo2330l();
                            }
                            try {
                                c1503l2 = new C1503l(c1904l.yandex.mo692default(c14025l));
                                try {
                                    c15510l.f30321l = c1904l;
                                    c15510l.f30320l = null;
                                    c15510l.f30323l = c1503l2;
                                    c15510l.f30322l = 2;
                                    objMo2331l = interfaceC18477l.mo2331l(new C11270l(i3, c1503l2));
                                    if (objMo2331l != enumC9342l) {
                                        c1904l3 = c1904l;
                                        c1503l3 = c1503l2;
                                        if (c1503l3 != null) {
                                            c1503l3.close();
                                        }
                                        Object obj3 = th2;
                                        th2 = objMo2331l;
                                        th = obj3;
                                        c1904l = c1904l3;
                                        if (th == 0) {
                                            return th2;
                                        }
                                        throw th;
                                    }
                                    return enumC9342l;
                                } catch (Throwable th9) {
                                    th = th9;
                                    c1904l3 = c1904l;
                                    c1503l3 = c1503l2;
                                    if (c1503l3 != null) {
                                        c1503l3.close();
                                    }
                                }
                            } catch (Exception e2) {
                                c1904l3 = c1904l;
                                e = e2;
                                if (e instanceof FileNotFoundException) {
                                    throw AbstractC11020l.crashlytics(String.valueOf(c1904l3.loadAd.crashlytics()), (FileNotFoundException) e);
                                }
                                throw e;
                            }
                        }
                    } catch (Throwable th10) {
                        AbstractC11718l.yandex(th, th10);
                    }
                }
                th = th;
                objMo2331l = null;
            }
        }
        if (th == null) {
            return objMo2331l;
        }
        throw th;
    }

    @Override // defpackage.InterfaceC1600l
    public final void close() {
        ((AtomicBoolean) this.amazon.f16631l).set(true);
    }

    @Override // defpackage.InterfaceC14978l
    public final Object purchase(C14570l c14570l) {
        return billing(this, c14570l);
    }
}
