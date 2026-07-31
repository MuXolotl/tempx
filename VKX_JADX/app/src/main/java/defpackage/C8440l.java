package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;

/* JADX INFO: renamed from: lًۨؐ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C8440l implements InterfaceC5137l {
    public final InterfaceC4335l amazon;
    public final C15053l crashlytics;
    public final C14025l loadAd;
    public final C11877l purchase;
    public final AbstractC5921l yandex;
    public final C7972l billing = new C7972l(3);
    public final C4910l mopub = AbstractC8618l.yandex();

    public C8440l(AbstractC5921l abstractC5921l, C14025l c14025l, C15053l c15053l, InterfaceC4335l interfaceC4335l, C11877l c11877l) {
        this.yandex = abstractC5921l;
        this.loadAd = c14025l;
        this.crashlytics = c15053l;
        this.amazon = interfaceC4335l;
        this.purchase = c11877l;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0071 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:32:0x0073  */
    /* JADX WARN: Code duplicated, block: B:34:0x0077 A[Catch: all -> 0x0078, TRY_ENTER, TRY_LEAVE, TryCatch #1 {all -> 0x0078, blocks: (B:34:0x0077, B:43:0x0088, B:42:0x0085, B:39:0x0080), top: B:52:0x0020, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:46:0x008c  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v0, types: [lًۨؐ] */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v12, types: [boolean] */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9 */
    /* JADX WARN: Type inference failed for: r8v0, types: [lٓۧٗ] */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v8, types: [boolean] */
    @Override // defpackage.InterfaceC5137l
    public final Object amazon(C14570l c14570l, AbstractC0283l abstractC0283l) throws Throwable {
        C15383l c15383l;
        ?? Mopub;
        Throwable th;
        C1904l c1904l;
        ?? r7;
        if (abstractC0283l instanceof C15383l) {
            c15383l = (C15383l) abstractC0283l;
            int i = c15383l.f30051l;
            if ((i & RecyclerView.UNDEFINED_DURATION) != 0) {
                c15383l.f30051l = i - RecyclerView.UNDEFINED_DURATION;
            } else {
                c15383l = new C15383l(this, abstractC0283l);
            }
        } else {
            c15383l = new C15383l(this, abstractC0283l);
        }
        Object obj = c15383l.f30054l;
        int i2 = c15383l.f30051l;
        C4910l c4910l = this.mopub;
        try {
            if (i2 != 0) {
                if (i2 != 1) {
                    C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                this = c15383l.f30052l;
                c1904l = c15383l.f30053l;
                try {
                    AbstractC2829l.crashlytics(obj);
                    r7 = this;
                    try {
                        c1904l.close();
                        th = null;
                    } catch (Throwable th2) {
                        th = th2;
                    }
                    if (th == null) {
                        throw th;
                    }
                    if (r7 != 0) {
                        c4910l.billing(null);
                    }
                    return obj;
                } catch (Throwable th3) {
                    th = th3;
                    try {
                        c1904l.close();
                    } catch (Throwable th4) {
                        AbstractC11718l.yandex(th, th4);
                    }
                    throw th;
                }
            }
            AbstractC2829l.crashlytics(obj);
            if (((AtomicBoolean) this.billing.f16631l).get()) {
                C8339l.smaato("StorageConnection has already been disposed.");
                return null;
            }
            Mopub = c4910l.mopub();
            try {
                C1904l c1904l2 = new C1904l(this.yandex, this.loadAd, this.crashlytics);
                try {
                    Boolean boolValueOf = Boolean.valueOf((boolean) Mopub);
                    c15383l.f30053l = c1904l2;
                    c15383l.f30052l = Mopub;
                    c15383l.f30051l = 1;
                    Object objInvoke = c14570l.invoke(c1904l2, boolValueOf, c15383l);
                    EnumC9342l enumC9342l = EnumC9342l.f19165l;
                    if (objInvoke == enumC9342l) {
                        return enumC9342l;
                    }
                    obj = objInvoke;
                    r7 = Mopub == true ? 1 : 0;
                    c1904l = c1904l2;
                    c1904l.close();
                    th = null;
                    if (th == null) {
                        throw th;
                    }
                    if (r7 != 0) {
                        c4910l.billing(null);
                    }
                    return obj;
                } catch (Throwable th5) {
                    th = th5;
                    this = Mopub == true ? 1 : 0;
                    c1904l = c1904l2;
                    c1904l.close();
                    throw th;
                }
            } catch (Throwable th6) {
                th = th6;
                if (Mopub != 0) {
                    c4910l.billing(null);
                }
                throw th;
            }
        } catch (Throwable th7) {
            th = th7;
            Mopub = this;
            if (Mopub != 0) {
                c4910l.billing(null);
            }
            throw th;
        }
    }

    @Override // defpackage.InterfaceC1600l
    public final void close() {
        ((AtomicBoolean) this.billing.f16631l).set(true);
        this.purchase.invoke();
    }

    @Override // defpackage.InterfaceC5137l
    public final InterfaceC4335l crashlytics() {
        return this.amazon;
    }

    /* JADX WARN: Code duplicated, block: B:39:0x00b5 A[Catch: all -> 0x00bf, IOException -> 0x00c2, TRY_ENTER, TryCatch #3 {IOException -> 0x00c2, blocks: (B:39:0x00b5, B:41:0x00bb, B:50:0x00ce, B:57:0x00db, B:56:0x00d8), top: B:78:0x0028 }] */
    /* JADX WARN: Code duplicated, block: B:41:0x00bb A[Catch: all -> 0x00bf, IOException -> 0x00c2, TRY_LEAVE, TryCatch #3 {IOException -> 0x00c2, blocks: (B:39:0x00b5, B:41:0x00bb, B:50:0x00ce, B:57:0x00db, B:56:0x00d8), top: B:78:0x0028 }] */
    /* JADX WARN: Code duplicated, block: B:50:0x00ce A[Catch: all -> 0x00bf, IOException -> 0x00c2, TRY_ENTER, TRY_LEAVE, TryCatch #3 {IOException -> 0x00c2, blocks: (B:39:0x00b5, B:41:0x00bb, B:50:0x00ce, B:57:0x00db, B:56:0x00d8), top: B:78:0x0028 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v2, types: [lًٓۤ] */
    /* JADX WARN: Type inference failed for: r0v4, types: [lًٓۤ] */
    /* JADX WARN: Type inference failed for: r12v4 */
    /* JADX WARN: Type inference failed for: r12v5, types: [lًٓۤ] */
    /* JADX WARN: Type inference failed for: r12v9 */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v2, types: [lٍؓؕ] */
    /* JADX WARN: Type inference failed for: r7v0, types: [lؘۘۜ] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // defpackage.InterfaceC5137l
    public final Object yandex(C14822l c14822l, AbstractC0283l abstractC0283l) throws Throwable {
        C3466l c3466l;
        ?? Purchase;
        InterfaceC1601l interfaceC1601l;
        C14025l c14025l;
        int i;
        C1340l c1340l;
        C1340l c1340l2;
        ?? r12;
        InterfaceC1601l interfaceC1601l2;
        if (abstractC0283l instanceof C3466l) {
            c3466l = (C3466l) abstractC0283l;
            int i2 = c3466l.f7345l;
            if ((i2 & RecyclerView.UNDEFINED_DURATION) != 0) {
                c3466l.f7345l = i2 - RecyclerView.UNDEFINED_DURATION;
            } else {
                c3466l = new C3466l(this, abstractC0283l);
            }
        } else {
            c3466l = new C3466l(this, abstractC0283l);
        }
        Object obj = c3466l.f7342l;
        ?? r2 = c3466l.f7345l;
        C14025l c14025l2 = this.loadAd;
        ?? r7 = this.yandex;
        EnumC9342l enumC9342l = EnumC9342l.f19165l;
        try {
            try {
                try {
                    try {
                        try {
                            if (r2 == 0) {
                                AbstractC2829l.crashlytics(obj);
                                if (((AtomicBoolean) this.billing.f16631l).get()) {
                                    C8339l.smaato("StorageConnection has already been disposed.");
                                    return null;
                                }
                                C14025l c14025lCrashlytics = c14025l2.crashlytics();
                                if (c14025lCrashlytics == null) {
                                    C8339l.smaato("must have a parent path");
                                    return null;
                                }
                                r7.mopub(c14025lCrashlytics);
                                c3466l.f7344l = c14822l;
                                c3466l.f7343l = c14025lCrashlytics;
                                interfaceC1601l = this.mopub;
                                c3466l.f7347l = interfaceC1601l;
                                c3466l.f7346l = 0;
                                c3466l.f7345l = 1;
                                if (interfaceC1601l.yandex(c3466l) != enumC9342l) {
                                    c14025l = c14025lCrashlytics;
                                    i = 0;
                                }
                                return enumC9342l;
                            }
                            if (r2 != 1) {
                                if (r2 != 2) {
                                    C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                                    return null;
                                }
                                c1340l2 = c3466l.f7341l;
                                C14025l c14025l3 = c3466l.f7340l;
                                interfaceC1601l2 = c3466l.f7347l;
                                try {
                                    AbstractC2829l.crashlytics(obj);
                                    r12 = c14025l3;
                                    Unit unit = Unit.INSTANCE;
                                    try {
                                        c1340l2.close();
                                        th = null;
                                    } catch (Throwable th) {
                                        th = th;
                                    }
                                    if (th == null) {
                                        throw th;
                                    }
                                    if (r7.isVip(r12)) {
                                        r7.billing(r12, c14025l2);
                                    }
                                    Unit unit2 = Unit.INSTANCE;
                                    interfaceC1601l2.billing(null);
                                    return Unit.INSTANCE;
                                } catch (Throwable th2) {
                                    th = th2;
                                    try {
                                        c1340l2.close();
                                    } catch (Throwable th3) {
                                        AbstractC11718l.yandex(th, th3);
                                    }
                                    throw th;
                                }
                            }
                            int i3 = c3466l.f7346l;
                            interfaceC1601l = c3466l.f7347l;
                            c14025l = c3466l.f7343l;
                            C14822l c14822l2 = c3466l.f7344l;
                            AbstractC2829l.crashlytics(obj);
                            i = i3;
                            c14822l = c14822l2;
                            c3466l.f7344l = null;
                            c3466l.f7343l = null;
                            c3466l.f7347l = interfaceC1601l;
                            c3466l.f7340l = Purchase;
                            c3466l.f7341l = c1340l;
                            c3466l.f7346l = i;
                            c3466l.f7345l = 2;
                            if (c14822l.invoke(c1340l, c3466l) != enumC9342l) {
                                r12 = Purchase;
                                interfaceC1601l2 = interfaceC1601l;
                                c1340l2 = c1340l;
                                Unit unit3 = Unit.INSTANCE;
                                c1340l2.close();
                                th = null;
                                if (th == null) {
                                    throw th;
                                }
                                if (r7.isVip(r12)) {
                                    r7.billing(r12, c14025l2);
                                }
                                Unit unit4 = Unit.INSTANCE;
                                interfaceC1601l2.billing(null);
                                return Unit.INSTANCE;
                            }
                            return enumC9342l;
                        } catch (Throwable th4) {
                            th = th4;
                            c1340l2 = c1340l;
                            c1340l2.close();
                            throw th;
                        }
                        r7.adcel(Purchase, false);
                        c1340l = new C1340l(r7, Purchase, this.crashlytics);
                    } catch (IOException e) {
                        e = e;
                        if (r7.isVip(Purchase)) {
                            try {
                                r7.adcel(Purchase, false);
                            } catch (IOException unused) {
                            }
                        }
                        throw e;
                    }
                    Purchase = c14025l.purchase(c14025l2.loadAd().concat(".tmp"));
                } catch (Throwable th5) {
                    th = th5;
                    r2 = ".tmp";
                    r2.billing(null);
                    throw th;
                }
            } catch (Throwable th6) {
                th = th6;
                r2.billing(null);
                throw th;
            }
        } catch (IOException e2) {
            e = e2;
            Purchase = c14822l;
        }
    }
}
