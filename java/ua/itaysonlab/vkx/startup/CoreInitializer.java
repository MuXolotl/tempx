package ua.itaysonlab.vkx.startup;

import android.content.Context;
import android.os.Build;
import defpackage.AbstractC0653l;
import defpackage.AbstractC15560l;
import defpackage.AbstractC17265l;
import defpackage.AbstractC18202l;
import defpackage.AbstractC18569l;
import defpackage.AbstractC2991l;
import defpackage.C11200l;
import defpackage.C15004l;
import defpackage.C2034l;
import defpackage.C2580l;
import defpackage.C8688l;
import defpackage.InterfaceC13497l;
import defpackage.InterfaceC17639l;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lua/itaysonlab/vkx/startup/CoreInitializer;", "Llْٛٗ;", "", "<init>", "()V", "app"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CoreInitializer implements InterfaceC13497l {
    public final C8688l yandex = new C8688l(new C11200l(29));

    @Override // defpackage.InterfaceC13497l
    public final List loadAd() {
        return C2580l.f5619l;
    }

    @Override // defpackage.InterfaceC13497l
    public final Object yandex(Context context) {
        AbstractC18569l.yandex.add(new C2034l());
        C15004l c15004l = new C15004l();
        C15004l[] c15004lArr = AbstractC2991l.admob;
        int length = c15004lArr.length;
        Object[] objArrCopyOf = Arrays.copyOf(c15004lArr, length + 1);
        objArrCopyOf[length] = c15004l;
        AbstractC2991l.admob = (C15004l[]) objArrCopyOf;
        StringBuilder sb = new StringBuilder("[vkx-version] 8.14.1_pub / [os] ");
        sb.append(Build.VERSION.RELEASE);
        sb.append(" / [device] ");
        AbstractC2991l.billing(AbstractC17265l.yandex(this), 4, AbstractC0653l.ads(sb, Build.DEVICE, " / by iTaysonLab"), null);
        for (InterfaceC17639l interfaceC17639l : (List) this.yandex.getValue()) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            interfaceC17639l.yandex(context);
            long jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
            StringBuilder sb2 = new StringBuilder("Initialized ");
            sb2.append(AbstractC18202l.yandex.loadAd(interfaceC17639l.getClass()).license());
            sb2.append(" in ");
            AbstractC2991l.billing(AbstractC17265l.yandex(this), 4, AbstractC15560l.ads(jCurrentTimeMillis2, " ms", sb2), null);
        }
        return Unit.INSTANCE;
    }
}
