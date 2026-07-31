package defpackage;

import java.nio.charset.Charset;
import kotlin.Unit;

/* JADX INFO: renamed from: lًٝؔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C8141l implements InterfaceC6942l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ C11310l f17021l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ Charset f17022l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ C14970l f17023l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC9354l f17024l;

    public C8141l(C14970l c14970l, Charset charset, C11310l c11310l, InterfaceC9354l interfaceC9354l) {
        this.f17023l = c14970l;
        this.f17022l = charset;
        this.f17021l = c11310l;
        this.f17024l = interfaceC9354l;
    }

    @Override // defpackage.InterfaceC6942l
    public final Object yandex(InterfaceC9427l interfaceC9427l, InterfaceC14029l interfaceC14029l) {
        Object objYandex = this.f17023l.yandex(new C5591l(interfaceC9427l, this.f17022l, this.f17021l, this.f17024l), interfaceC14029l);
        return objYandex == EnumC9342l.f19165l ? objYandex : Unit.INSTANCE;
    }
}
