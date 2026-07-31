package defpackage;

import android.graphics.Color;
import androidx.car.app.model.Alert;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: lُّۘ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C12803l implements Function1 {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC12244l f25182l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f25183l;

    public /* synthetic */ C12803l(InterfaceC12244l interfaceC12244l, int i) {
        this.f25183l = i;
        this.f25182l = interfaceC12244l;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Object c18435l;
        String str;
        int i = this.f25183l;
        InterfaceC12244l interfaceC12244l = this.f25182l;
        switch (i) {
            case 0:
                String str2 = (String) obj;
                List list = C0072l.f976l;
                boolean zContainsKey = ((C15343l) interfaceC12244l.getValue()).f29992l.containsKey(str2);
                int iIntValue = Alert.DURATION_SHOW_INDEFINITELY;
                if (zContainsKey) {
                    try {
                        c18435l = Integer.valueOf(Color.parseColor((String) ((C15343l) interfaceC12244l.getValue()).f29992l.get(str2)));
                    } catch (Throwable th) {
                        c18435l = new C18435l(th);
                    }
                    if (c18435l instanceof C18435l) {
                        c18435l = null;
                    }
                    Integer num = (Integer) c18435l;
                    if (num != null) {
                        iIntValue = num.intValue();
                    }
                    break;
                }
                return Integer.valueOf(iIntValue);
            default:
                String str3 = (String) obj;
                List list2 = C0072l.f976l;
                return (!((C15343l) interfaceC12244l.getValue()).f29992l.containsKey(str3) || (str = (String) ((C15343l) interfaceC12244l.getValue()).f29992l.get(str3)) == null) ? "" : str;
        }
    }
}
