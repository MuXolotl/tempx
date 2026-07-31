package defpackage;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: lؘْٝ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C5834l extends C1538l implements Function0 {

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public final /* synthetic */ int f12288l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C5834l(int i, Object obj, Class cls, String str, String str2, int i2, int i3, int i4) {
        super(i, obj, cls, str, str2, i2, i3);
        this.f12288l = i4;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        List list;
        int i = this.f12288l;
        int i2 = 15;
        byte b = 0;
        byte b2 = 0;
        int i3 = 0;
        Object obj = this.f26698l;
        switch (i) {
            case 0:
                Object value = ((C0614l) obj).crashlytics.f15551l.getValue();
                C17279l c17279l = value instanceof C17279l ? (C17279l) value : null;
                ArrayList arrayList = c17279l != null ? c17279l.amazon : null;
                return arrayList == null ? C2580l.f5619l : arrayList;
            case 1:
                ((C10264l) obj).mo1143default();
                return Unit.INSTANCE;
            case 2:
                C9135l c9135l = (C9135l) obj;
                c9135l.getClass();
                DecimalFormat decimalFormat = C15638l.yandex;
                C15638l.yandex(((C8311l) c9135l.f18782l.getValue()).crashlytics);
                return Unit.INSTANCE;
            case 3:
                ((C9135l) obj).purchase();
                return Unit.INSTANCE;
            case 4:
                C9135l c9135l2 = (C9135l) obj;
                c9135l2.getClass();
                AbstractC10999l.mopub(c9135l2, null, 0, new C15556l(c9135l2, b == true ? 1 : 0, i2), 3);
                return Unit.INSTANCE;
            case 5:
                ((C9135l) obj).purchase();
                return Unit.INSTANCE;
            case 6:
                Activity activity = ((C9135l) obj).f5081l;
                if (Build.VERSION.SDK_INT >= 26) {
                    activity.startActivityForResult(new Intent("android.settings.MANAGE_UNKNOWN_APP_SOURCES").setData(Uri.parse(String.format("package:%s", Arrays.copyOf(new Object[]{activity.getPackageName()}, 1)))), 39);
                }
                return Unit.INSTANCE;
            case 7:
                ((C9135l) obj).advert();
                return Unit.INSTANCE;
            case 8:
                C9135l c9135l3 = (C9135l) obj;
                if (((C8311l) c9135l3.f18782l.getValue()).yandex == 39) {
                    AbstractC10999l.mopub(c9135l3, null, 0, new C15556l(c9135l3, b2 == true ? 1 : 0, i2), 3);
                } else {
                    c9135l3.advert();
                }
                return Unit.INSTANCE;
            case 9:
                ((C9135l) obj).purchase();
                return Unit.INSTANCE;
            case 10:
                C9135l.ad((C9135l) obj);
                return Unit.INSTANCE;
            case 11:
                ((C10610l) obj).purchase.yandex(new C10612l(i3, C5452l.INSTANCE), new C16419l(3));
                return Unit.INSTANCE;
            default:
                ((C3095l) obj).getClass();
                C6232l c6232lAdcel = AbstractC7470l.adcel((C7026l) AbstractC16584l.loadAd().f15742l);
                return Collections.singletonList(((c6232lAdcel == null || (list = c6232lAdcel.loadAd) == null) ? 0 : list.size()) != 0 ? C4526l.INSTANCE : C15990l.INSTANCE);
        }
    }
}
