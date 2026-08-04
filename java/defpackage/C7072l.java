package defpackage;

import android.hardware.camera2.CaptureResult;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: lؚۣؗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C7072l implements Function1 {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ Map f14817l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f14818l;

    public /* synthetic */ C7072l(int i, Map map) {
        this.f14818l = i;
        this.f14817l = map;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        boolean z;
        int i = this.f14818l;
        Map map = this.f14817l;
        switch (i) {
            case 0:
                String str = (String) obj;
                C4273l c4273l = (C4273l) map.get(str);
                if (c4273l != null) {
                    return c4273l;
                }
                C8936l.isPro(str, " key should be downloaded, but not present in key database");
                return null;
            default:
                C15331l c15331l = (C15331l) obj;
                for (Map.Entry entry : map.entrySet()) {
                    if (!AbstractC16901l.inmobi((List) entry.getValue(), c15331l.f29963l.get((CaptureResult.Key) entry.getKey()))) {
                        z = false;
                        return Boolean.valueOf(z);
                    }
                }
                z = true;
                return Boolean.valueOf(z);
        }
    }
}
