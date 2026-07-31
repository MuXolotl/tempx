package defpackage;

import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: lؘۡؗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C6022l implements Function0 {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final C13146l f12800l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final C8792l f12801l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f12802l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final C1689l f12803l;

    public /* synthetic */ C6022l(C8792l c8792l, C13146l c13146l, C1689l c1689l, int i) {
        this.f12802l = i;
        this.f12801l = c8792l;
        this.f12800l = c13146l;
        this.f12803l = c1689l;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.f12802l;
        C1689l c1689l = this.f12803l;
        C13146l c13146l = this.f12800l;
        C8792l c8792l = this.f12801l;
        switch (i) {
            case 0:
                C16412l c16412l = (C16412l) ((C0511l) c8792l.yandex.f15738l).yandex;
                C6022l c6022l = new C6022l(c8792l, c13146l, c1689l, 2);
                c16412l.getClass();
                return new C9004l(c16412l, c6022l);
            case 1:
                C16412l c16412l2 = (C16412l) ((C0511l) c8792l.yandex.f15738l).yandex;
                C6022l c6022l2 = new C6022l(c8792l, c13146l, c1689l, 3);
                c16412l2.getClass();
                return new C9004l(c16412l2, c6022l2);
            case 2:
                C7644l c7644l = c8792l.yandex;
                return (AbstractC0757l) ((InterfaceC0252l) ((C0511l) c7644l.f15738l).purchase).adcel(c8792l.yandex((InterfaceC8371l) c7644l.f15734l), c13146l, c1689l.smaato());
            default:
                C7644l c7644l2 = c8792l.yandex;
                return (AbstractC0757l) ((InterfaceC0252l) ((C0511l) c7644l2.f15738l).purchase).billing(c8792l.yandex((InterfaceC8371l) c7644l2.f15734l), c13146l, c1689l.smaato());
        }
    }
}
