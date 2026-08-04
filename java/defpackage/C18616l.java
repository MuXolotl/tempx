package defpackage;

import android.view.View;
import java.util.WeakHashMap;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: l۠ٓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C18616l implements InterfaceC13914l {
    public final /* synthetic */ Object crashlytics;
    public final /* synthetic */ Object loadAd;
    public final /* synthetic */ int yandex;

    public /* synthetic */ C18616l(Object obj, Object obj2, int i) {
        this.yandex = i;
        this.loadAd = obj;
        this.crashlytics = obj2;
    }

    @Override // defpackage.InterfaceC13914l
    public final void yandex() {
        int i = this.yandex;
        Object obj = this.crashlytics;
        Object obj2 = this.loadAd;
        switch (i) {
            case 0:
                ((C16590l) obj2).loadAd((C10968l) obj);
                break;
            case 1:
                ((C13138l) obj2).yandex.remoteconfig((C8456l) obj);
                break;
            case 2:
                ((C10641l) obj2).f21595l.smaato(obj);
                break;
            case 3:
                ((AbstractC6475l) obj2).loadAd((InterfaceC13342l) obj);
                break;
            case 4:
                ((C16590l) obj2).loadAd((C6449l) obj);
                break;
            case 5:
                C17594l c17594l = (C17594l) obj2;
                if (c17594l.loadAd == ((C0205l) obj)) {
                    c17594l.loadAd = null;
                    c17594l.yandex.setValue(null);
                }
                break;
            case 6:
                InterfaceC8714l interfaceC8714l = (InterfaceC8714l) obj2;
                C12951l c12951l = (C12951l) interfaceC8714l.getValue();
                if (c12951l != null) {
                    C10129l c10129l = new C10129l(c12951l);
                    C2403l c2403l = (C2403l) obj;
                    if (c2403l != null) {
                        c2403l.loadAd(c10129l);
                    }
                    interfaceC8714l.setValue(null);
                }
                break;
            case 7:
                ((C4487l) obj2).crashlytics.remove((Function1) obj);
                break;
            case 8:
                ((C18656l) obj2).firebase.remove((C18656l) obj);
                break;
            case 9:
                C18656l c18656l = (C18656l) obj2;
                c18656l.getClass();
                C17421l c17421l = (C17421l) ((C15738l) obj).loadAd.getValue();
                if (c17421l != null) {
                    c18656l.isPro.remove(c17421l.f33958l);
                }
                break;
            case 10:
                ((C18656l) obj2).isPro.remove((C9459l) obj);
                break;
            default:
                C12923l c12923l = (C12923l) obj2;
                View view = (View) obj;
                int i2 = c12923l.Signature - 1;
                c12923l.Signature = i2;
                if (i2 == 0) {
                    WeakHashMap weakHashMap = AbstractC15872l.yandex;
                    AbstractC8558l.crashlytics(view, null);
                    AbstractC15872l.startapp(view, null);
                    view.removeOnAttachStateChangeListener(c12923l.license);
                }
                break;
        }
    }
}
