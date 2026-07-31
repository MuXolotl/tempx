package defpackage;

import java.util.Iterator;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: lؙٕۜ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C6761l implements InterfaceC11075l {
    public final Object amazon;
    public final Function2 crashlytics;
    public final int loadAd;
    public final /* synthetic */ int yandex;

    public /* synthetic */ C6761l(Object obj, int i, Function2 function2, int i2) {
        this.yandex = i2;
        this.amazon = obj;
        this.loadAd = i;
        this.crashlytics = function2;
    }

    @Override // defpackage.InterfaceC11075l
    public final Iterator iterator() {
        switch (this.yandex) {
            case 0:
                return new C16167l(this);
            default:
                return new C0149l(this);
        }
    }
}
