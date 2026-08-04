package defpackage;

import android.view.textclassifier.TextClassifier;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: lّٟٓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C14325l extends AbstractC5563l implements Function2 {

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public int f28055l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public final /* synthetic */ C11528l f28056l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public InterfaceC1601l f28057l;

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public final /* synthetic */ Function2 f28058l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public C11528l f28059l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14325l(C11528l c11528l, Function2 function2, InterfaceC14029l interfaceC14029l) {
        super(2, interfaceC14029l);
        this.f28056l = c11528l;
        this.f28058l = function2;
    }

    /* JADX WARN: Code duplicated, block: B:36:0x009c A[RETURN] */
    @Override // defpackage.AbstractC12050l
    public final Object Signature(Object obj) throws Throwable {
        C11528l c11528l;
        InterfaceC1601l interfaceC1601l;
        InterfaceC1601l interfaceC1601l2;
        TextClassifier textClassifierPurchase;
        Object objAdmob;
        int i = this.f28055l;
        EnumC16636l enumC16636l = EnumC16636l.MILLISECONDS;
        InterfaceC14029l interfaceC14029l = null;
        EnumC9342l enumC9342l = EnumC9342l.f19165l;
        try {
            if (i == 0) {
                AbstractC2829l.crashlytics(obj);
                c11528l = this.f28056l;
                interfaceC1601l = c11528l.purchase;
                this.f28057l = interfaceC1601l;
                this.f28059l = c11528l;
                this.f28055l = 1;
                if (interfaceC1601l.yandex(this) != enumC9342l) {
                }
                return enumC9342l;
            }
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        AbstractC2829l.crashlytics(obj);
                        return obj;
                    }
                    C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                interfaceC1601l2 = this.f28057l;
                try {
                    AbstractC2829l.crashlytics(obj);
                    textClassifierPurchase = C18073l.purchase(obj);
                    interfaceC1601l = interfaceC1601l2;
                    interfaceC1601l.billing(null);
                    C6760l c6760l = C9658l.f19699l;
                    long jSignature = AbstractC15918l.Signature(200L, enumC16636l);
                    C5888l c5888l = new C5888l(textClassifierPurchase, this.f28058l, interfaceC14029l, 23);
                    this.f28057l = null;
                    this.f28059l = null;
                    this.f28055l = 3;
                    objAdmob = AbstractC15342l.admob(AbstractC8532l.subs(jSignature), c5888l, this);
                    if (objAdmob == enumC9342l) {
                        return enumC9342l;
                    }
                    return objAdmob;
                } catch (Throwable th) {
                    th = th;
                    interfaceC1601l2.billing(null);
                    throw th;
                }
            }
            c11528l = this.f28059l;
            InterfaceC1601l interfaceC1601l3 = this.f28057l;
            AbstractC2829l.crashlytics(obj);
            interfaceC1601l = interfaceC1601l3;
            textClassifierPurchase = c11528l.billing;
            if (textClassifierPurchase == null || textClassifierPurchase.isDestroyed()) {
                C6760l c6760l2 = C9658l.f19699l;
                long jSignature2 = AbstractC15918l.Signature(300L, enumC16636l);
                C14019l c14019l = new C14019l(c11528l, interfaceC14029l, 7);
                this.f28057l = interfaceC1601l;
                this.f28059l = null;
                this.f28055l = 2;
                Object objAdmob2 = AbstractC15342l.admob(AbstractC8532l.subs(jSignature2), c14019l, this);
                if (objAdmob2 != enumC9342l) {
                    interfaceC1601l2 = interfaceC1601l;
                    obj = objAdmob2;
                    textClassifierPurchase = C18073l.purchase(obj);
                    interfaceC1601l = interfaceC1601l2;
                    interfaceC1601l.billing(null);
                    C6760l c6760l3 = C9658l.f19699l;
                    long jSignature3 = AbstractC15918l.Signature(200L, enumC16636l);
                    C5888l c5888l2 = new C5888l(textClassifierPurchase, this.f28058l, interfaceC14029l, 23);
                    this.f28057l = null;
                    this.f28059l = null;
                    this.f28055l = 3;
                    objAdmob = AbstractC15342l.admob(AbstractC8532l.subs(jSignature3), c5888l2, this);
                    if (objAdmob == enumC9342l) {
                        return objAdmob;
                    }
                }
            } else {
                interfaceC1601l.billing(null);
                C6760l c6760l4 = C9658l.f19699l;
                long jSignature4 = AbstractC15918l.Signature(200L, enumC16636l);
                C5888l c5888l3 = new C5888l(textClassifierPurchase, this.f28058l, interfaceC14029l, 23);
                this.f28057l = null;
                this.f28059l = null;
                this.f28055l = 3;
                objAdmob = AbstractC15342l.admob(AbstractC8532l.subs(jSignature4), c5888l3, this);
                if (objAdmob == enumC9342l) {
                    return objAdmob;
                }
            }
            return enumC9342l;
        } catch (Throwable th2) {
            th = th2;
            interfaceC1601l2 = interfaceC1601l;
            interfaceC1601l2.billing(null);
            throw th;
        }
    }

    @Override // defpackage.AbstractC12050l
    public final InterfaceC14029l ads(InterfaceC14029l interfaceC14029l, Object obj) {
        return new C14325l(this.f28056l, this.f28058l, interfaceC14029l);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C14325l) ads((InterfaceC14029l) obj2, (InterfaceC2262l) obj)).Signature(Unit.INSTANCE);
    }
}
