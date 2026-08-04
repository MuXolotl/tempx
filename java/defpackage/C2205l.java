package defpackage;

import android.content.Context;
import android.net.Uri;
import com.google.common.util.concurrent.ListenableFuture;

/* JADX INFO: renamed from: lؘۣؓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C2205l implements InterfaceC9474l {

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public static final InterfaceC11766l f4868l = AbstractC15788l.purchase(new C0120l(0));

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final int f4869l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final C0458l f4870l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final InterfaceExecutorServiceC0212l f4871l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final boolean f4872l;

    public C2205l(appmetrica appmetricaVar) {
        this.f4870l = new C0458l((Context) appmetricaVar.f492l);
        InterfaceExecutorServiceC0212l interfaceExecutorServiceC0212l = (InterfaceExecutorServiceC0212l) f4868l.get();
        interfaceExecutorServiceC0212l.getClass();
        this.f4871l = interfaceExecutorServiceC0212l;
        this.f4869l = appmetricaVar.f489l;
        this.f4872l = appmetricaVar.f490l;
    }

    @Override // defpackage.InterfaceC9474l
    /* JADX INFO: renamed from: default, reason: not valid java name */
    public final ListenableFuture mo1118default(C3852l c3852l) {
        byte[] bArr = c3852l.firebase;
        if (bArr != null) {
            return mo1119try(bArr);
        }
        Uri uri = c3852l.vip;
        if (uri == null) {
            return null;
        }
        return ((C17438l) this.f4871l).yandex(new CallableC4082l(this, uri, 1));
    }

    @Override // defpackage.InterfaceC9474l
    /* JADX INFO: renamed from: try, reason: not valid java name */
    public final ListenableFuture mo1119try(byte[] bArr) {
        return ((C17438l) this.f4871l).yandex(new CallableC4082l(this, bArr, 0));
    }
}
