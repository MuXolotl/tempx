package defpackage;

import java.util.Arrays;
import java.util.Collection;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: lٌٍِ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C9420l {
    public final Function1 amazon;
    public final Collection crashlytics;
    public final C11155l loadAd;
    public final InterfaceC4121l[] purchase;
    public final C3498l yandex;

    public C9420l(C3498l c3498l, InterfaceC4121l[] interfaceC4121lArr, Function1 function1) {
        this(c3498l, null, null, function1, (InterfaceC4121l[]) Arrays.copyOf(interfaceC4121lArr, interfaceC4121lArr.length));
    }

    public /* synthetic */ C9420l(C3498l c3498l, InterfaceC4121l[] interfaceC4121lArr) {
        this(c3498l, interfaceC4121lArr, C5818l.f12247l);
    }

    public C9420l(C3498l c3498l, C11155l c11155l, Collection collection, Function1 function1, InterfaceC4121l... interfaceC4121lArr) {
        this.yandex = c3498l;
        this.loadAd = c11155l;
        this.crashlytics = collection;
        this.amazon = function1;
        this.purchase = interfaceC4121lArr;
    }

    public /* synthetic */ C9420l(Collection collection, InterfaceC4121l[] interfaceC4121lArr) {
        this(collection, interfaceC4121lArr, C5818l.f12242l);
    }

    public C9420l(Collection collection, InterfaceC4121l[] interfaceC4121lArr, Function1 function1) {
        this(null, null, collection, function1, (InterfaceC4121l[]) Arrays.copyOf(interfaceC4121lArr, interfaceC4121lArr.length));
    }
}
