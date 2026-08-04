package defpackage;

import java.nio.charset.Charset;
import kotlin.Unit;

/* JADX INFO: renamed from: lِۧٞ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C12265l implements InterfaceC6942l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ Charset f24330l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ C5254l f24331l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ C14970l f24332l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final /* synthetic */ Object f24333l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final /* synthetic */ C11310l f24334l;

    public C12265l(C14970l c14970l, C5254l c5254l, Charset charset, C11310l c11310l, Object obj) {
        this.f24332l = c14970l;
        this.f24331l = c5254l;
        this.f24330l = charset;
        this.f24334l = c11310l;
        this.f24333l = obj;
    }

    @Override // defpackage.InterfaceC6942l
    public final Object yandex(InterfaceC9427l interfaceC9427l, InterfaceC14029l interfaceC14029l) {
        Object objYandex = this.f24332l.yandex(new C5768l(interfaceC9427l, this.f24331l, this.f24330l, this.f24334l, this.f24333l), interfaceC14029l);
        return objYandex == EnumC9342l.f19165l ? objYandex : Unit.INSTANCE;
    }
}
