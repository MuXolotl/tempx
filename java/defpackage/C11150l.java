package defpackage;

import android.view.textclassifier.TextClassifier;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: lُِٛ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C11150l extends AbstractC5563l implements Function2 {

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public final /* synthetic */ C11528l f22419l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public final /* synthetic */ CharSequence f22420l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public int f22421l;

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public final /* synthetic */ long f22422l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public /* synthetic */ Object f22423l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11150l(long j, InterfaceC14029l interfaceC14029l, C11528l c11528l, CharSequence charSequence) {
        super(2, interfaceC14029l);
        this.f22419l = c11528l;
        this.f22420l = charSequence;
        this.f22422l = j;
    }

    @Override // defpackage.AbstractC12050l
    public final Object Signature(Object obj) {
        int i = this.f22421l;
        if (i == 0) {
            AbstractC2829l.crashlytics(obj);
            TextClassifier textClassifierPurchase = C18073l.purchase(this.f22423l);
            this.f22421l = 1;
            Object objYandex = C11528l.yandex(this.f22419l, this.f22420l, this.f22422l, textClassifierPurchase, this);
            EnumC9342l enumC9342l = EnumC9342l.f19165l;
            if (objYandex == enumC9342l) {
                return enumC9342l;
            }
        } else {
            if (i != 1) {
                C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC2829l.crashlytics(obj);
        }
        return Unit.INSTANCE;
    }

    @Override // defpackage.AbstractC12050l
    public final InterfaceC14029l ads(InterfaceC14029l interfaceC14029l, Object obj) {
        C11150l c11150l = new C11150l(this.f22422l, interfaceC14029l, this.f22419l, this.f22420l);
        c11150l.f22423l = obj;
        return c11150l;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C11150l) ads((InterfaceC14029l) obj2, C18073l.purchase(obj))).Signature(Unit.INSTANCE);
    }
}
