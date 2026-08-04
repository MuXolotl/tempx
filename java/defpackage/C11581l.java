package defpackage;

import java.io.Serializable;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: lِؓٙ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C11581l extends AbstractC5563l implements Function2 {

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public int f23272l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public int f23273l;

    /* JADX INFO: renamed from: lٍَؑ, reason: contains not printable characters */
    public int f23274l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public C4816l f23275l;

    /* JADX INFO: renamed from: lُٓٚ, reason: contains not printable characters */
    public final /* synthetic */ C16076l f23276l;

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public int f23277l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public C16076l f23278l;

    /* JADX INFO: renamed from: lٕۛۨ, reason: contains not printable characters */
    public final /* synthetic */ C4816l f23279l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11581l(C4816l c4816l, C16076l c16076l, InterfaceC14029l interfaceC14029l) {
        super(2, interfaceC14029l);
        this.f23279l = c4816l;
        this.f23276l = c16076l;
    }

    /* JADX WARN: Not initialized variable reg: 3, insn: 0x004d: IF  (r0v0 ?? I:??[int, boolean, OBJECT, ARRAY, byte, short, char]) == (r3 I:??[int, boolean, OBJECT, ARRAY, byte, short, char])  -> B:20:0x0052 (LINE:78), block:B:18:0x004d */
    @Override // defpackage.AbstractC12050l
    public final Object Signature(Object obj) throws Exception {
        int i;
        int i2;
        int i3 = this.f23274l;
        try {
            if (i3 != 0) {
                if (i3 != 1) {
                    C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                int i4 = this.f23277l;
                int i5 = this.f23273l;
                int i6 = this.f23272l;
                C16076l c16076l = this.f23278l;
                C4816l c4816l = this.f23275l;
                AbstractC2829l.crashlytics(obj);
                return obj;
            }
            AbstractC2829l.crashlytics(obj);
            new Exception("This should not be visible here!");
            C4816l c4816l2 = this.f23279l;
            C16076l c16076l2 = this.f23276l;
            i2 = 0;
            i = 3;
            C2258l c2258l = c16076l2.f31521l;
            InterfaceC17817l interfaceC17817l = c2258l.amazon;
            this.f23275l = c4816l2;
            this.f23278l = c16076l2;
            this.f23272l = i;
            this.f23273l = 0;
            this.f23277l = i2;
            this.f23274l = 1;
            Serializable serializableAdmob = c4816l2.admob(c2258l, interfaceC17817l, this);
            EnumC9342l enumC9342l = EnumC9342l.f19165l;
            return serializableAdmob == enumC9342l ? enumC9342l : serializableAdmob;
        } catch (Exception e) {
            if (i3 == i) {
                e.printStackTrace();
                throw e;
            }
            i2 = i3 + 1;
        }
    }

    @Override // defpackage.AbstractC12050l
    public final InterfaceC14029l ads(InterfaceC14029l interfaceC14029l, Object obj) {
        return new C11581l(this.f23279l, this.f23276l, interfaceC14029l);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C11581l) ads((InterfaceC14029l) obj2, (InterfaceC2262l) obj)).Signature(Unit.INSTANCE);
    }
}
