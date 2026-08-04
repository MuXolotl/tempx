package defpackage;

import android.webkit.WebView;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: lّۨٛ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C13026l extends AbstractC5563l implements Function2 {

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public final /* synthetic */ C16875l f25513l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public final /* synthetic */ WebView f25514l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final /* synthetic */ int f25515l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public int f25516l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C13026l(C16875l c16875l, WebView webView, InterfaceC14029l interfaceC14029l, int i) {
        super(2, interfaceC14029l);
        this.f25515l = i;
        this.f25513l = c16875l;
        this.f25514l = webView;
    }

    @Override // defpackage.AbstractC12050l
    public final Object Signature(Object obj) throws Throwable {
        int i = this.f25515l;
        C16875l c16875l = this.f25513l;
        EnumC9342l enumC9342l = EnumC9342l.f19165l;
        switch (i) {
            case 0:
                int i2 = this.f25516l;
                if (i2 == 0) {
                    AbstractC2829l.crashlytics(obj);
                    this.f25516l = 1;
                    c16875l.yandex(this.f25514l, this);
                    return enumC9342l;
                }
                if (i2 != 1) {
                    C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                } else {
                    AbstractC2829l.crashlytics(obj);
                    C17132l.firebase();
                }
                return null;
            default:
                int i3 = this.f25516l;
                if (i3 != 0) {
                    if (i3 != 1) {
                        C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        AbstractC2829l.crashlytics(obj);
                        C17132l.firebase();
                    }
                    return null;
                }
                AbstractC2829l.crashlytics(obj);
                C8490l c8490l = c16875l.yandex;
                C0763l c0763l = new C0763l(3);
                this.f25516l = 1;
                c8490l.yandex(c0763l, this);
                return enumC9342l;
        }
    }

    @Override // defpackage.AbstractC12050l
    public final InterfaceC14029l ads(InterfaceC14029l interfaceC14029l, Object obj) {
        int i = this.f25515l;
        WebView webView = this.f25514l;
        C16875l c16875l = this.f25513l;
        switch (i) {
            case 0:
                return new C13026l(c16875l, webView, interfaceC14029l, 0);
            default:
                return new C13026l(c16875l, webView, interfaceC14029l, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        int i = this.f25515l;
        EnumC9342l enumC9342l = EnumC9342l.f19165l;
        InterfaceC2262l interfaceC2262l = (InterfaceC2262l) obj;
        InterfaceC14029l interfaceC14029l = (InterfaceC14029l) obj2;
        switch (i) {
            case 0:
                ((C13026l) ads(interfaceC14029l, interfaceC2262l)).Signature(Unit.INSTANCE);
                break;
            default:
                ((C13026l) ads(interfaceC14029l, interfaceC2262l)).Signature(Unit.INSTANCE);
                break;
        }
        return enumC9342l;
    }
}
