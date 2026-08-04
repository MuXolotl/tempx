package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: lُ٘ؗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C17703l extends AbstractC5563l implements Function1 {

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public final /* synthetic */ int f34490l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public final /* synthetic */ boolean f34491l;

    /* JADX INFO: renamed from: lٍَؑ, reason: contains not printable characters */
    public final /* synthetic */ C10712l f34492l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public int f34493l;

    /* JADX INFO: renamed from: lُٓٚ, reason: contains not printable characters */
    public final /* synthetic */ int f34494l;

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public final /* synthetic */ float f34495l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final /* synthetic */ C8998l f34496l;

    /* JADX INFO: renamed from: lٕۛۨ, reason: contains not printable characters */
    public final /* synthetic */ float f34497l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C17703l(C8998l c8998l, int i, boolean z, float f, C10712l c10712l, float f2, int i2, InterfaceC14029l interfaceC14029l) {
        super(1, interfaceC14029l);
        this.f34496l = c8998l;
        this.f34490l = i;
        this.f34491l = z;
        this.f34495l = f;
        this.f34492l = c10712l;
        this.f34497l = f2;
        this.f34494l = i2;
    }

    @Override // defpackage.AbstractC12050l
    public final Object Signature(Object obj) {
        InterfaceC12932l interfaceC12932l;
        int i = this.f34493l;
        InterfaceC12932l interfaceC12932l2 = this.f1295l;
        C8998l c8998l = this.f34496l;
        try {
            if (i == 0) {
                AbstractC2829l.crashlytics(obj);
                c8998l.mopub(this.f34490l);
                C10086l c10086l = c8998l.f18546l;
                c8998l.f18542l.setValue(1);
                c8998l.f18549l.setValue(Boolean.valueOf(this.f34491l));
                C10086l c10086l2 = c8998l.f18552l;
                float f = this.f34495l;
                c10086l2.setValue(Float.valueOf(f));
                c8998l.f18548l.setValue(null);
                C10086l c10086l3 = c8998l.f18551l;
                C10712l c10712l = this.f34492l;
                c10086l3.setValue(c10712l);
                c8998l.admob(this.f34497l);
                C10086l c10086l4 = c8998l.f18543l;
                Boolean bool = Boolean.FALSE;
                c10086l4.setValue(bool);
                c8998l.f18550l.setValue(Long.MIN_VALUE);
                if (c10712l == null) {
                    c10086l.setValue(bool);
                    return Unit.INSTANCE;
                }
                if (Float.isInfinite(f)) {
                    c8998l.admob(c8998l.purchase());
                    c10086l.setValue(bool);
                    c8998l.mopub(1);
                    return Unit.INSTANCE;
                }
                c10086l.setValue(Boolean.TRUE);
                int iInmobi = AbstractC5020l.inmobi(this.f34494l);
                if (iInmobi == 0) {
                    interfaceC12932l = C17218l.f33421l;
                } else {
                    if (iInmobi != 1) {
                        throw new C6451l(11);
                    }
                    interfaceC12932l = C8035l.f16723l;
                }
                C11789l c11789l = new C11789l(this.f34494l, AbstractC11174l.mopub(interfaceC12932l2), this.f34490l, this.f34496l, (InterfaceC14029l) null);
                this.f34493l = 1;
                Object objFirebase = AbstractC10999l.firebase(interfaceC12932l, c11789l, this);
                EnumC9342l enumC9342l = EnumC9342l.f19165l;
                if (objFirebase == enumC9342l) {
                    return enumC9342l;
                }
            } else {
                if (i != 1) {
                    C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC2829l.crashlytics(obj);
            }
            AbstractC11174l.billing(interfaceC12932l2);
            C8998l.amazon(c8998l, false);
            return Unit.INSTANCE;
        } catch (Throwable th) {
            C8998l.amazon(c8998l, false);
            throw th;
        }
    }

    @Override // defpackage.AbstractC12050l
    public final InterfaceC14029l adcel(InterfaceC14029l interfaceC14029l) {
        return new C17703l(this.f34496l, this.f34490l, this.f34491l, this.f34495l, this.f34492l, this.f34497l, this.f34494l, interfaceC14029l);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((C17703l) adcel((InterfaceC14029l) obj)).Signature(Unit.INSTANCE);
    }
}
