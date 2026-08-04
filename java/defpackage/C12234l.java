package defpackage;

import android.os.Build;
import android.view.View;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;

/* JADX INFO: renamed from: lِۥَ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C12234l extends AbstractC5563l implements Function4 {

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public /* synthetic */ C15237l f24285l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC14592l f24286l;

    /* JADX INFO: renamed from: lٍَؑ, reason: contains not printable characters */
    public final /* synthetic */ View f24287l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public int f24288l;

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public final /* synthetic */ Function2 f24289l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public /* synthetic */ C15237l f24290l;

    /* JADX INFO: renamed from: lٕۛۨ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC12244l f24291l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C12234l(InterfaceC14592l interfaceC14592l, Function2 function2, View view, InterfaceC12244l interfaceC12244l, InterfaceC14029l interfaceC14029l) {
        super(4, interfaceC14029l);
        this.f24286l = interfaceC14592l;
        this.f24289l = function2;
        this.f24287l = view;
        this.f24291l = interfaceC12244l;
    }

    @Override // defpackage.AbstractC12050l
    public final Object Signature(Object obj) {
        C15237l c15237l = this.f24290l;
        C15237l c15237l2 = this.f24285l;
        int i = this.f24288l;
        if (i == 0) {
            AbstractC2829l.crashlytics(obj);
            InterfaceC14592l interfaceC14592l = this.f24286l;
            interfaceC14592l.tapsense();
            this.f24289l.invoke(new Integer(c15237l.yandex - 1), new Integer(c15237l2.yandex - 1));
            this.f24290l = null;
            this.f24285l = null;
            this.f24288l = 1;
            Object objSignature = interfaceC14592l.Signature(this);
            EnumC9342l enumC9342l = EnumC9342l.f19165l;
            if (objSignature == enumC9342l) {
                return enumC9342l;
            }
        } else {
            if (i != 1) {
                C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC2829l.crashlytics(obj);
        }
        View view = this.f24287l;
        if (AbstractC0676l.crashlytics(view.getContext()) && !((C18554l) this.f24291l.getValue()).f36219l) {
            if (Build.VERSION.SDK_INT >= 34) {
                view.performHapticFeedback(27);
            } else {
                view.performHapticFeedback(4);
            }
        }
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function4
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        View view = this.f24287l;
        InterfaceC12244l interfaceC12244l = this.f24291l;
        C12234l c12234l = new C12234l(this.f24286l, this.f24289l, view, interfaceC12244l, (InterfaceC14029l) obj4);
        c12234l.f24290l = (C15237l) obj2;
        c12234l.f24285l = (C15237l) obj3;
        return c12234l.Signature(Unit.INSTANCE);
    }
}
