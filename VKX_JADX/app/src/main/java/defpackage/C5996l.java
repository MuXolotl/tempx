package defpackage;

import android.util.Log;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: lؘ۟ٗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C5996l implements Function0 {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ Object f12721l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ Object f12722l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f12723l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final /* synthetic */ Object f12724l;

    public /* synthetic */ C5996l(Object obj, Object obj2, Object obj3, int i) {
        this.f12723l = i;
        this.f12722l = obj;
        this.f12721l = obj2;
        this.f12724l = obj3;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0080  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i;
        int i2 = this.f12723l;
        Object obj = this.f12724l;
        Object obj2 = this.f12721l;
        Object obj3 = this.f12722l;
        switch (i2) {
            case 0:
                AbstractC10999l.mopub((InterfaceC2262l) obj3, null, 0, new C15352l((C0072l) obj2, (InterfaceC12244l) obj, null, 21), 3);
                return Unit.INSTANCE;
            case 1:
                C9395l c9395l = (C9395l) obj3;
                C8462l c8462l = (C8462l) obj2;
                C7686l c7686l = (C7686l) obj;
                C10814l c10814l = ((C11419l) c9395l.purchase.getValue()).crashlytics() ? (C10814l) c9395l.billing.getValue() : null;
                if (c10814l != null) {
                    int i3 = c10814l.admob;
                    if (i3 == 1) {
                        i = 1;
                    } else if (i3 == 0) {
                        i = 0;
                    } else {
                        if (i3 == 0 || i3 == 1) {
                            Log.e("CXCP", "Custom operating mode " + i3 + " conflicts with standard modes");
                            throw new IllegalArgumentException(Unit.INSTANCE.toString());
                        }
                        i = i3;
                    }
                } else {
                    i = 0;
                }
                return c8462l.yandex(i, c10814l, false, c7686l, null, (Map) c9395l.crashlytics.getValue(), (Map) c9395l.amazon.getValue());
            case 2:
                new C1254l(((C5218l) obj3).f11302l, ((Boolean) ((C10086l) obj2).getValue()).booleanValue()).Signature(((C4456l) obj).f5081l);
                return Unit.INSTANCE;
            default:
                List list = (List) obj2;
                C1187l[] c1187lArr = (C1187l[]) obj;
                for (Map.Entry entry : ((Map) obj3).entrySet()) {
                    c1187lArr[((Number) entry.getKey()).intValue()] = ((C5616l) entry.getValue()).amazon();
                }
                return list;
        }
    }
}
