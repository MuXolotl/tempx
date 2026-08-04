package defpackage;

import java.io.Serializable;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: lؚؕۛ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C3637l extends AbstractC5563l implements Function1 {

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public Serializable f7604l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public int f7605l;

    /* JADX INFO: renamed from: lٍَؑ, reason: contains not printable characters */
    public final /* synthetic */ boolean f7606l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public C16916l f7607l;

    /* JADX INFO: renamed from: lُٓٚ, reason: contains not printable characters */
    public final /* synthetic */ Function2 f7608l;

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public int f7609l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public Object f7610l;

    /* JADX INFO: renamed from: lٕۛۨ, reason: contains not printable characters */
    public final /* synthetic */ C0360l f7611l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3637l(boolean z, C0360l c0360l, Function2 function2, InterfaceC14029l interfaceC14029l) {
        super(1, interfaceC14029l);
        this.f7606l = z;
        this.f7611l = c0360l;
        this.f7608l = function2;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x007c A[Catch: lٗؗٓ -> 0x0051, TryCatch #0 {lٗؗٓ -> 0x0051, blocks: (B:17:0x004a, B:42:0x00b5, B:22:0x0058, B:37:0x0097, B:23:0x005f, B:31:0x007c, B:33:0x0082, B:27:0x006a, B:39:0x00a3), top: B:66:0x0013 }] */
    /* JADX WARN: Code duplicated, block: B:32:0x0081  */
    /* JADX WARN: Code duplicated, block: B:35:0x0094  */
    /* JADX WARN: Code duplicated, block: B:36:0x0095  */
    /* JADX WARN: Code duplicated, block: B:58:0x010d  */
    @Override // defpackage.AbstractC12050l
    public final Object Signature(Object obj) throws C16916l {
        Object objVip;
        C10700l c10700l;
        C16916l c16916l;
        C10700l c10700l2;
        C16916l c16916l2;
        C10700l c10700l3;
        C9987l c9987l;
        Object objAmazon;
        Object objAds;
        int iHashCode;
        Object objInvoke;
        Object obj2;
        int i;
        int i2 = this.f7609l;
        Function2 function2 = this.f7608l;
        boolean z = this.f7606l;
        C0360l c0360l = this.f7611l;
        EnumC9342l enumC9342l = EnumC9342l.f19165l;
        try {
            if (i2 == 0) {
                AbstractC2829l.crashlytics(obj);
                if (!z) {
                    InterfaceC4335l interfaceC4335lMopub = c0360l.mopub();
                    C18539l c18539l = new C18539l(c0360l, function2, (InterfaceC14029l) null);
                    this.f7609l = 3;
                    objAmazon = interfaceC4335lMopub.amazon(c18539l, this);
                    if (objAmazon == enumC9342l) {
                    }
                    return (C2856l) objAmazon;
                }
                this.f7609l = 1;
                objAds = AbstractC5088l.ads(new C10781l(1, null, c0360l), this);
                if (objAds != enumC9342l) {
                    if (objAds != null) {
                        iHashCode = objAds.hashCode();
                    } else {
                        iHashCode = 0;
                    }
                    Boolean boolValueOf = Boolean.valueOf(z);
                    this.f7607l = null;
                    this.f7610l = objAds;
                    this.f7605l = iHashCode;
                    this.f7609l = 2;
                    objInvoke = function2.invoke(boolValueOf, this);
                    if (objInvoke != enumC9342l) {
                        obj2 = objAds;
                        i = iHashCode;
                        return new C2856l(obj2, i, ((Number) objInvoke).intValue());
                    }
                }
                return enumC9342l;
            }
            if (i2 == 1) {
                AbstractC2829l.crashlytics(obj);
                objAds = obj;
                if (objAds != null) {
                    iHashCode = objAds.hashCode();
                } else {
                    iHashCode = 0;
                }
                Boolean boolValueOf2 = Boolean.valueOf(z);
                this.f7607l = null;
                this.f7610l = objAds;
                this.f7605l = iHashCode;
                this.f7609l = 2;
                objInvoke = function2.invoke(boolValueOf2, this);
                if (objInvoke != enumC9342l) {
                    return enumC9342l;
                }
                obj2 = objAds;
                i = iHashCode;
            } else {
                if (i2 != 2) {
                    if (i2 == 3) {
                        AbstractC2829l.crashlytics(obj);
                        objAmazon = obj;
                        return (C2856l) objAmazon;
                    }
                    if (i2 != 4) {
                        if (i2 != 5) {
                            C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        c9987l = (C9987l) this.f7604l;
                        c10700l3 = (C10700l) this.f7610l;
                        c16916l2 = this.f7607l;
                        try {
                            AbstractC2829l.crashlytics(obj);
                            Object obj3 = c10700l3.f21708l;
                            return new C2856l(obj3, obj3 != null ? obj3.hashCode() : 0, c9987l.f20387l);
                        } catch (Throwable th) {
                            th = th;
                            AbstractC11718l.yandex(c16916l2, th);
                            throw c16916l2;
                        }
                    }
                    c10700l2 = (C10700l) this.f7604l;
                    C10700l c10700l4 = (C10700l) this.f7610l;
                    C16916l c16916l3 = this.f7607l;
                    AbstractC2829l.crashlytics(obj);
                    c10700l = c10700l4;
                    c16916l = c16916l3;
                    objVip = obj;
                    c10700l2.f21708l = objVip;
                    C9987l c9987l2 = new C9987l();
                    try {
                        boolean z2 = this.f7606l;
                        C11991l c11991l = new C11991l(c10700l, c0360l, c9987l2, this.f7608l, z2, null);
                        this.f7607l = c16916l;
                        this.f7610l = c10700l;
                        this.f7604l = c9987l2;
                        this.f7609l = 5;
                        if ((z2 ? c11991l.invoke(this) : c0360l.mopub().loadAd(new C13954l(c11991l, null, 3), this)) == enumC9342l) {
                            return enumC9342l;
                        }
                        c10700l3 = c10700l;
                        c9987l = c9987l2;
                        Object obj4 = c10700l3.f21708l;
                        return new C2856l(obj4, obj4 != null ? obj4.hashCode() : 0, c9987l.f20387l);
                    } catch (Throwable th2) {
                        th = th2;
                        c16916l2 = c16916l;
                        AbstractC11718l.yandex(c16916l2, th);
                        throw c16916l2;
                    }
                }
                i = this.f7605l;
                Object obj5 = this.f7610l;
                AbstractC2829l.crashlytics(obj);
                obj2 = obj5;
                objInvoke = obj;
            }
            return new C2856l(obj2, i, ((Number) objInvoke).intValue());
        } catch (C16916l e) {
            C10700l c10700l5 = new C10700l();
            InterfaceC0208l interfaceC0208l = c0360l.loadAd;
            this.f7607l = e;
            this.f7610l = c10700l5;
            this.f7604l = c10700l5;
            this.f7609l = 4;
            objVip = interfaceC0208l.vip(e);
            if (objVip != enumC9342l) {
                c10700l = c10700l5;
                c16916l = e;
                c10700l2 = c10700l;
            }
            return enumC9342l;
        }
    }

    @Override // defpackage.AbstractC12050l
    public final InterfaceC14029l adcel(InterfaceC14029l interfaceC14029l) {
        return new C3637l(this.f7606l, this.f7611l, this.f7608l, interfaceC14029l);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((C3637l) adcel((InterfaceC14029l) obj)).Signature(Unit.INSTANCE);
    }
}
