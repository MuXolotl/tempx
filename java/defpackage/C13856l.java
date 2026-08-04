package defpackage;

import java.util.ArrayList;
import kotlin.jvm.functions.Function0;
import ua.itaysonlab.vkx.VKXApplication;

/* JADX INFO: renamed from: lٓؐۦ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C13856l implements InterfaceC13742l {
    public final /* synthetic */ C10038l loadAd;
    public final /* synthetic */ ArrayList yandex;

    public C13856l(ArrayList arrayList, C10038l c10038l) {
        this.yandex = arrayList;
        this.loadAd = c10038l;
    }

    public final void yandex(int i, int i2, Function0 function0) {
        VKXApplication.Companion companion = VKXApplication.f36628l;
        this.yandex.add(new C11967l(i2, VKXApplication.Companion.loadAd(i), false, new C10063l(function0, this.loadAd, 1)));
    }
}
