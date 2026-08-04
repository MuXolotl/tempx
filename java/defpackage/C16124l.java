package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: lٖؑۙ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C16124l implements InterfaceC6942l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final Function2 f31576l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final Function1 f31577l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final InterfaceC6942l f31578l;

    public C16124l(InterfaceC6942l interfaceC6942l, Function1 function1, Function2 function2) {
        this.f31578l = interfaceC6942l;
        this.f31577l = function1;
        this.f31576l = function2;
    }

    @Override // defpackage.InterfaceC6942l
    public final Object yandex(InterfaceC9427l interfaceC9427l, InterfaceC14029l interfaceC14029l) {
        C10700l c10700l = new C10700l();
        c10700l.f21708l = AbstractC2878l.yandex;
        Object objYandex = this.f31578l.yandex(new C17354l(this, c10700l, interfaceC9427l), interfaceC14029l);
        return objYandex == EnumC9342l.f19165l ? objYandex : Unit.INSTANCE;
    }
}
