package defpackage;

import android.os.Bundle;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: lِٖۖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C11883l implements InterfaceC15438l {
    public final /* synthetic */ C9471l yandex;

    public C11883l(C9471l c9471l) {
        this.yandex = c9471l;
    }

    @Override // defpackage.InterfaceC15438l
    public final String Signature() {
        BinderC1079l binderC1079l = new BinderC1079l();
        C9471l c9471l = this.yandex;
        c9471l.yandex(new C5506l(c9471l, binderC1079l, 1));
        return (String) BinderC1079l.m784l(binderC1079l.isPro(50L), String.class);
    }

    @Override // defpackage.InterfaceC15438l
    public final void adcel(String str) {
        C9471l c9471l = this.yandex;
        c9471l.yandex(new C1936l(c9471l, str, 0));
    }

    @Override // defpackage.InterfaceC15438l
    public final String admob() {
        BinderC1079l binderC1079l = new BinderC1079l();
        C9471l c9471l = this.yandex;
        c9471l.yandex(new C5506l(c9471l, binderC1079l, 3, false));
        return (String) BinderC1079l.m784l(binderC1079l.isPro(500L), String.class);
    }

    @Override // defpackage.InterfaceC15438l
    public final void ads(String str, String str2, Bundle bundle) {
        C9471l c9471l = this.yandex;
        c9471l.yandex(new C15911l(c9471l, str, str2, bundle, 0));
    }

    @Override // defpackage.InterfaceC15438l
    public final String license() {
        BinderC1079l binderC1079l = new BinderC1079l();
        C9471l c9471l = this.yandex;
        c9471l.yandex(new C5506l(c9471l, binderC1079l, 0));
        return (String) BinderC1079l.m784l(binderC1079l.isPro(500L), String.class);
    }

    @Override // defpackage.InterfaceC15438l
    public final void metrica(Bundle bundle) {
        C9471l c9471l = this.yandex;
        c9471l.yandex(new C2454l(c9471l, bundle, 1));
    }

    @Override // defpackage.InterfaceC15438l
    public final Map pro(String str, String str2, boolean z) {
        BinderC1079l binderC1079l = new BinderC1079l();
        C9471l c9471l = this.yandex;
        c9471l.yandex(new C16236l(c9471l, str, str2, z, binderC1079l));
        Bundle bundleIsPro = binderC1079l.isPro(5000L);
        if (bundleIsPro == null || bundleIsPro.size() == 0) {
            return Collections.EMPTY_MAP;
        }
        HashMap map = new HashMap(bundleIsPro.size());
        for (String str3 : bundleIsPro.keySet()) {
            Object obj = bundleIsPro.get(str3);
            if ((obj instanceof Double) || (obj instanceof Long) || (obj instanceof String)) {
                map.put(str3, obj);
            }
        }
        return map;
    }

    @Override // defpackage.InterfaceC15438l
    public final long remoteconfig() {
        return this.yandex.amazon();
    }

    @Override // defpackage.InterfaceC15438l
    public final void startapp(String str) {
        C9471l c9471l = this.yandex;
        c9471l.yandex(new C1936l(c9471l, str, 1));
    }

    @Override // defpackage.InterfaceC15438l
    public final void subs(String str, String str2, Bundle bundle) {
        C9471l c9471l = this.yandex;
        c9471l.yandex(new C15911l(c9471l, str, str2, bundle, 1));
    }

    @Override // defpackage.InterfaceC15438l
    public final List subscription(String str, String str2) {
        BinderC1079l binderC1079l = new BinderC1079l();
        C9471l c9471l = this.yandex;
        c9471l.yandex(new C5539l(c9471l, str, str2, binderC1079l));
        List list = (List) BinderC1079l.m784l(binderC1079l.isPro(5000L), List.class);
        return list == null ? Collections.EMPTY_LIST : list;
    }

    @Override // defpackage.InterfaceC15438l
    public final int tapsense(String str) {
        BinderC1079l binderC1079l = new BinderC1079l();
        C9471l c9471l = this.yandex;
        c9471l.yandex(new C9625l(c9471l, str, binderC1079l, 1));
        Integer num = (Integer) BinderC1079l.m784l(binderC1079l.isPro(10000L), Integer.class);
        if (num == null) {
            return 25;
        }
        return num.intValue();
    }

    @Override // defpackage.InterfaceC15438l
    public final String vip() {
        BinderC1079l binderC1079l = new BinderC1079l();
        C9471l c9471l = this.yandex;
        c9471l.yandex(new C5506l(c9471l, binderC1079l, 4, false));
        return (String) BinderC1079l.m784l(binderC1079l.isPro(500L), String.class);
    }
}
