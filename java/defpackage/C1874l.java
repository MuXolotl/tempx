package defpackage;

import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: lٖؓٙ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C1874l extends AbstractC5563l implements Function2 {

    /* JADX INFO: renamed from: lؒٝؖ, reason: contains not printable characters */
    public final /* synthetic */ Function1 f4298l;

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC5995l f4299l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public final /* synthetic */ C16328l f4300l;

    /* JADX INFO: renamed from: lؖۦؚ, reason: contains not printable characters */
    public final /* synthetic */ Function1 f4301l;

    /* JADX INFO: renamed from: lٍَؑ, reason: contains not printable characters */
    public final /* synthetic */ C0554l f4302l;

    /* JADX INFO: renamed from: lٍۢۚ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC3114l f4303l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public int f4304l;

    /* JADX INFO: renamed from: lُٓٚ, reason: contains not printable characters */
    public final /* synthetic */ C14966l f4305l;

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public final /* synthetic */ C10312l f4306l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public /* synthetic */ Object f4307l;

    /* JADX INFO: renamed from: lٕۛۨ, reason: contains not printable characters */
    public final /* synthetic */ C12095l f4308l;

    /* JADX INFO: renamed from: lُٗۜ, reason: contains not printable characters */
    public final /* synthetic */ Function0 f4309l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1874l(InterfaceC5995l interfaceC5995l, C16328l c16328l, C10312l c10312l, C0554l c0554l, C12095l c12095l, C14966l c14966l, Function1 function1, Function0 function0, InterfaceC3114l interfaceC3114l, Function1 function2, InterfaceC14029l interfaceC14029l) {
        super(2, interfaceC14029l);
        this.f4299l = interfaceC5995l;
        this.f4300l = c16328l;
        this.f4306l = c10312l;
        this.f4302l = c0554l;
        this.f4308l = c12095l;
        this.f4305l = c14966l;
        this.f4298l = function1;
        this.f4309l = function0;
        this.f4303l = interfaceC3114l;
        this.f4301l = function2;
    }

    @Override // defpackage.AbstractC12050l
    public final Object Signature(Object obj) {
        int i = this.f4304l;
        InterfaceC14029l interfaceC14029l = null;
        if (i != 0) {
            if (i != 1) {
                C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC2829l.crashlytics(obj);
            C17132l.firebase();
            return null;
        }
        AbstractC2829l.crashlytics(obj);
        InterfaceC2262l interfaceC2262l = (InterfaceC2262l) this.f4307l;
        C16328l c16328l = this.f4300l;
        C0554l c0554l = this.f4302l;
        AbstractC10999l.mopub(interfaceC2262l, null, 4, new C12086l(c16328l, c0554l, interfaceC14029l, 9), 1);
        InterfaceC5995l interfaceC5995l = this.f4299l;
        if (interfaceC5995l != null) {
            AbstractC10999l.mopub(interfaceC2262l, null, 0, new C12086l(interfaceC5995l, c0554l, interfaceC14029l, 10), 3);
        }
        final C5719l c5719l = new C5719l(c16328l, this.f4306l, c0554l, interfaceC2262l);
        final C16328l c16328l2 = this.f4300l;
        final C14966l c14966l = this.f4305l;
        final C0554l c0554l2 = this.f4302l;
        final Function1 function1 = this.f4298l;
        final C10312l c10312l = this.f4306l;
        final Function0 function0 = this.f4309l;
        final InterfaceC3114l interfaceC3114l = this.f4303l;
        final Function1 function2 = this.f4301l;
        InterfaceC2301l interfaceC2301l = new InterfaceC2301l() { // from class: lٌٕؗ
            @Override // defpackage.InterfaceC2301l
            public final InputConnection yandex(EditorInfo editorInfo) {
                C16328l c16328l3 = c16328l2;
                C18289l c18289l = new C18289l(new C17219l(c16328l3), c16328l3, c0554l2, function1, c5719l, c10312l, function0, interfaceC3114l, function2);
                AbstractC7720l.admob(editorInfo, c16328l3.amazon(), c16328l3.amazon().f12061l, c14966l);
                return new InputConnectionC12817l(c18289l, editorInfo);
            }
        };
        this.f4304l = 1;
        this.f4308l.yandex(interfaceC2301l, this);
        return EnumC9342l.f19165l;
    }

    @Override // defpackage.AbstractC12050l
    public final InterfaceC14029l ads(InterfaceC14029l interfaceC14029l, Object obj) {
        C1874l c1874l = new C1874l(this.f4299l, this.f4300l, this.f4306l, this.f4302l, this.f4308l, this.f4305l, this.f4298l, this.f4309l, this.f4303l, this.f4301l, interfaceC14029l);
        c1874l.f4307l = obj;
        return c1874l;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ((C1874l) ads((InterfaceC14029l) obj2, (InterfaceC2262l) obj)).Signature(Unit.INSTANCE);
        return EnumC9342l.f19165l;
    }
}
