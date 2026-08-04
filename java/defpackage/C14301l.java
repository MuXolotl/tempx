package defpackage;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: lٓٞؗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C14301l implements Function0 {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final Object f27986l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final Object f27987l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f27988l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final int f27989l;

    public /* synthetic */ C14301l(Object obj, Object obj2, int i, int i2) {
        this.f27988l = i2;
        this.f27987l = obj;
        this.f27986l = obj2;
        this.f27989l = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        List listM4213const;
        int i = this.f27988l;
        C2580l c2580l = C2580l.f5619l;
        int i2 = this.f27989l;
        Object obj = this.f27986l;
        Object obj2 = this.f27987l;
        switch (i) {
            case 0:
                C8792l c8792l = (C8792l) obj2;
                AbstractC14080l abstractC14080l = (AbstractC14080l) obj;
                C7644l c7644l = c8792l.yandex;
                AbstractC3031l abstractC3031lYandex = c8792l.yandex((InterfaceC8371l) c7644l.f15734l);
                listM4213const = abstractC3031lYandex != null ? AbstractC16901l.m4213const(((InterfaceC0252l) ((C0511l) c7644l.f15738l).purchase).tapsense(abstractC3031lYandex, abstractC14080l, i2)) : null;
                return listM4213const == null ? c2580l : listM4213const;
            case 1:
                C8792l c8792l2 = (C8792l) obj2;
                AbstractC14080l abstractC14080l2 = (AbstractC14080l) obj;
                C7644l c7644l2 = c8792l2.yandex;
                AbstractC3031l abstractC3031lYandex2 = c8792l2.yandex((InterfaceC8371l) c7644l2.f15734l);
                listM4213const = abstractC3031lYandex2 != null ? ((InterfaceC0252l) ((C0511l) c7644l2.f15738l).purchase).smaato(abstractC3031lYandex2, abstractC14080l2, i2) : null;
                return listM4213const == null ? c2580l : listM4213const;
            default:
                C4619l c4619l = (C4619l) obj2;
                C1850l c1850l = (C1850l) ((ArrayList) obj).get(i2);
                boolean z = c1850l.crashlytics == null;
                EnumC7061l enumC7061l = (EnumC7061l) c4619l.f9374l;
                boolean z2 = enumC7061l == EnumC7061l.TYPE_PARAMETER_BOUNDS;
                if (!z && !z2) {
                    enumC7061l = EnumC7061l.TYPE_USE;
                }
                C8943l c8943l = c1850l.loadAd;
                if (c8943l != null) {
                    return (C8622l) c8943l.yandex.get(enumC7061l);
                }
                return null;
        }
    }
}
