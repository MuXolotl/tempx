package defpackage;

import java.util.Iterator;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: lؘُ٘, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C17838l {
    public final /* synthetic */ Object crashlytics;
    public final /* synthetic */ int loadAd;
    public Object yandex;

    public C17838l(Object obj, Object obj2, int i) {
        this.loadAd = i;
        this.crashlytics = obj2;
        this.yandex = obj;
    }

    public final void crashlytics(InterfaceC13922l interfaceC13922l, Object obj) {
        Object obj2 = this.yandex;
        Object obj3 = this.crashlytics;
        int i = this.loadAd;
        switch (i) {
            case 2:
                if (((C9911l) obj3).yandex) {
                    C8339l.smaato("Cannot modify readonly DescriptorRendererOptions");
                }
                break;
        }
        this.yandex = obj;
        switch (i) {
            case 0:
                Boolean bool = (Boolean) obj;
                bool.getClass();
                ((Boolean) obj2).getClass();
                Iterator it = ((C8108l) obj3).loadAd.iterator();
                while (it.hasNext()) {
                    ((Function1) it.next()).invoke(bool);
                }
                break;
            case 1:
                ((Boolean) obj).getClass();
                ((Boolean) obj2).getClass();
                ((C17873l) obj3).billing();
                break;
        }
    }

    public final String toString() {
        return "ObservableProperty(value=" + this.yandex + ')';
    }

    public final void loadAd() {
    }

    public final void yandex(Object obj, Object obj2) {
    }
}
