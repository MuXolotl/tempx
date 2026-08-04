package defpackage;

import android.content.Context;
import android.os.PowerManager;
import ua.itaysonlab.vkx.R;
import ua.itaysonlab.vkx.VKXApplication;

/* JADX INFO: renamed from: lٌِٗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C17064l extends AbstractC17254l {
    @Override // defpackage.AbstractC17254l
    public final Object yandex(Context context, InterfaceC14029l interfaceC14029l) {
        VKXApplication vKXApplication = VKXApplication.f36631l;
        if (vKXApplication == null) {
            vKXApplication = null;
        }
        PowerManager powerManager = (PowerManager) vKXApplication.getSystemService(PowerManager.class);
        if (powerManager != null) {
            VKXApplication vKXApplication2 = VKXApplication.f36631l;
            if (!powerManager.isIgnoringBatteryOptimizations((vKXApplication2 != null ? vKXApplication2 : null).getPackageName())) {
                return new C6594l(new C1812l(R.string.qf_power, R.string.qf_power_description, R.drawable.ic_power_socket_outline_28, new C5601l(new C14959l(2, this, C17064l.class, "resolve", "resolve(Landroid/content/Context;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0, 0, 10), R.drawable.ic_flash_outline_28, R.string.qf_power_action, 8)));
            }
        }
        return C2614l.yandex;
    }
}
