package defpackage;

import android.graphics.Rect;
import android.media.MediaCodec;
import android.util.Size;
import java.util.Comparator;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: lٍۥْ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C9933l implements Comparator {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ Object f20227l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f20228l;

    public /* synthetic */ C9933l(int i, Object obj) {
        this.f20228l = i;
        this.f20227l = obj;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int i = this.f20228l;
        int i2 = 0;
        Object obj3 = this.f20227l;
        switch (i) {
            case 0:
                for (Function1 function1 : (Function1[]) obj3) {
                    int iCrashlytics = AbstractC2920l.crashlytics((Comparable) function1.invoke(obj), (Comparable) function1.invoke(obj2));
                    if (iCrashlytics != 0) {
                        return iCrashlytics;
                    }
                }
                return 0;
            case 1:
                InterfaceC11459l interfaceC11459l = (InterfaceC11459l) obj3;
                return interfaceC11459l.subs(obj2) - interfaceC11459l.subs(obj);
            case 2:
                return ((Number) ((C1645l) obj3).invoke(obj, obj2)).intValue();
            case 3:
                return ((Number) ((Function2) obj3).invoke(obj, obj2)).intValue();
            case 4:
                C14113l c14113l = (C14113l) obj2;
                ((C14706l) obj3).getClass();
                Class cls = ((C14113l) obj).yandex.isPro;
                int i3 = cls == MediaCodec.class ? 2 : (cls == C0527l.class || cls == C10245l.class) ? 0 : 1;
                Class cls2 = c14113l.yandex.isPro;
                if (cls2 == MediaCodec.class) {
                    i2 = 2;
                } else if (cls2 != C0527l.class && cls2 != C10245l.class) {
                    i2 = 1;
                }
                return i3 - i2;
            default:
                Rect rect = (Rect) obj3;
                Size size = (Size) obj;
                Size size2 = (Size) obj2;
                return (Math.abs(size.getHeight() - rect.height()) + Math.abs(size.getWidth() - rect.width())) - (Math.abs(size2.getHeight() - rect.height()) + Math.abs(size2.getWidth() - rect.width()));
        }
    }
}
