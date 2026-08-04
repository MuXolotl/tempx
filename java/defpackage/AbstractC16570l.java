package defpackage;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import androidx.car.app.model.Alert;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import org.conscrypt.PSKKeyManager;
import ua.itaysonlab.vkx.activity.AppActivity;

/* JADX INFO: renamed from: lّٖۗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC16570l {
    public static final C15578l yandex = new C15578l(1687917626, false, new C12851l(24));
    public static final C15578l loadAd = new C15578l(1711306513, false, new C12851l(25));

    public static final PendingIntent amazon(InterfaceC12133l interfaceC12133l, C4372l c4372l, int i, C13206l c13206l) {
        Context context = c4372l.yandex;
        if (interfaceC12133l instanceof InterfaceC4310l) {
            InterfaceC4310l interfaceC4310l = (InterfaceC4310l) interfaceC12133l;
            Intent intentPurchase = purchase(interfaceC4310l, c4372l, interfaceC4310l.getParameters());
            if (intentPurchase.getData() == null) {
                intentPurchase.setData(AbstractC11999l.loadAd(c4372l, i, 5, String.valueOf(intentPurchase.getFlags())));
            }
            Unit unit = Unit.INSTANCE;
            return PendingIntent.getActivity(context, 0, intentPurchase, 201326592, interfaceC4310l.yandex());
        }
        if (interfaceC12133l instanceof C12620l) {
            C12620l c12620l = (C12620l) interfaceC12133l;
            if (!(c12620l instanceof C12620l)) {
                C18725l.billing();
                return null;
            }
            Intent intent = c12620l.yandex;
            if (intent.getData() == null) {
                intent.setData(AbstractC11999l.loadAd(c4372l, i, 5, String.valueOf(intent.getFlags())));
            }
            return Build.VERSION.SDK_INT >= 26 ? AbstractC5941l.appmetrica(context, intent) : PendingIntent.getService(context, 0, intent, 201326592);
        }
        if (!(interfaceC12133l instanceof AbstractC10284l)) {
            C17132l.metrica(interfaceC12133l, "Cannot create PendingIntent for action type: ");
            return null;
        }
        ComponentName componentName = c4372l.vip;
        if (componentName == null) {
            C8339l.metrica("In order to use LambdaAction, actionBroadcastReceiver must be provided");
            return null;
        }
        Intent intentPutExtra = new Intent().setComponent(componentName).setAction("ACTION_TRIGGER_LAMBDA").putExtra("EXTRA_ACTION_KEY", (String) null).putExtra("EXTRA_APPWIDGET_ID", c4372l.loadAd);
        intentPutExtra.setData(AbstractC11999l.loadAd(c4372l, i, 5, null));
        Unit unit2 = Unit.INSTANCE;
        return PendingIntent.getBroadcast(context, 0, intentPutExtra, 201326592);
    }

    public static final AbstractC15211l billing(AbstractC18041l abstractC18041l) {
        AbstractC14318l abstractC14318lMo3847class = abstractC18041l.mo3847class();
        if (abstractC14318lMo3847class instanceof AbstractC4317l) {
            return ((AbstractC4317l) abstractC14318lMo3847class).f8857l;
        }
        if (abstractC14318lMo3847class instanceof AbstractC15211l) {
            return (AbstractC15211l) abstractC14318lMo3847class;
        }
        C18725l.billing();
        return null;
    }

    public static final Intent crashlytics(InterfaceC12133l interfaceC12133l, C4372l c4372l, int i, C13206l c13206l) {
        if (interfaceC12133l instanceof InterfaceC4310l) {
            InterfaceC4310l interfaceC4310l = (InterfaceC4310l) interfaceC12133l;
            Intent intentPurchase = purchase(interfaceC4310l, c4372l, interfaceC4310l.getParameters());
            if (intentPurchase.getData() == null) {
                intentPurchase.setData(AbstractC11999l.loadAd(c4372l, i, 5, String.valueOf(intentPurchase.getFlags())));
            }
            return intentPurchase;
        }
        if (interfaceC12133l instanceof C12620l) {
            C12620l c12620l = (C12620l) interfaceC12133l;
            if (c12620l instanceof C12620l) {
                return AbstractC11999l.yandex(c12620l.yandex, c4372l, i, 4);
            }
            C18725l.billing();
            return null;
        }
        if (!(interfaceC12133l instanceof AbstractC10284l)) {
            C17132l.metrica(interfaceC12133l, "Cannot create fill-in Intent for action type: ");
            return null;
        }
        ComponentName componentName = c4372l.vip;
        if (componentName != null) {
            return AbstractC11999l.yandex(new Intent().setComponent(componentName).setAction("ACTION_TRIGGER_LAMBDA").putExtra("EXTRA_ACTION_KEY", (String) null).putExtra("EXTRA_APPWIDGET_ID", c4372l.loadAd), c4372l, i, 2);
        }
        C8339l.metrica("In order to use LambdaAction, actionBroadcastReceiver must be provided");
        return null;
    }

    public static boolean loadAd(Object obj, Object obj2) {
        if (obj != obj2) {
            return (obj == null || obj2 == null || !obj.equals(obj2)) ? false : true;
        }
        return true;
    }

    public static final AbstractC15211l mopub(AbstractC18041l abstractC18041l) {
        AbstractC14318l abstractC14318lMo3847class = abstractC18041l.mo3847class();
        if (abstractC14318lMo3847class instanceof AbstractC4317l) {
            return ((AbstractC4317l) abstractC14318lMo3847class).f8856l;
        }
        if (abstractC14318lMo3847class instanceof AbstractC15211l) {
            return (AbstractC15211l) abstractC14318lMo3847class;
        }
        C18725l.billing();
        return null;
    }

    public static final Intent purchase(InterfaceC4310l interfaceC4310l, C4372l c4372l, C14724l c14724l) {
        Intent intent;
        if (interfaceC4310l instanceof C6154l) {
            intent = new Intent(c4372l.yandex, (Class<?>) AppActivity.class);
        } else {
            if (!(interfaceC4310l instanceof C15184l)) {
                C17132l.metrica(interfaceC4310l, "Action type not defined in app widget package: ");
                return null;
            }
            intent = ((C15184l) interfaceC4310l).yandex;
        }
        Map mapUnmodifiableMap = DesugarCollections.unmodifiableMap(c14724l.yandex);
        ArrayList arrayList = new ArrayList(mapUnmodifiableMap.size());
        for (Map.Entry entry : mapUnmodifiableMap.entrySet()) {
            C16762l c16762l = (C16762l) entry.getKey();
            arrayList.add(new C8195l(c16762l.yandex, entry.getValue()));
        }
        C8195l[] c8195lArr = (C8195l[]) arrayList.toArray(new C8195l[0]);
        intent.putExtras(AbstractC1315l.loadAd((C8195l[]) Arrays.copyOf(c8195lArr, c8195lArr.length)));
        return intent;
    }

    public static final void yandex(final String str, InterfaceC12001l interfaceC12001l, final C12373l c12373l, int i, C6956l c6956l, final int i2, final int i3) {
        int i4;
        c6956l.m2133new(-192911377);
        int i5 = (c6956l.billing(str) ? 4 : 2) | i2;
        int i6 = i3 & 2;
        int i7 = 16;
        if (i6 != 0) {
            i4 = i5 | 48;
        } else {
            i4 = i5 | (c6956l.billing(interfaceC12001l) ? 32 : 16);
        }
        int i8 = i4 | (c6956l.billing(c12373l) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128);
        int i9 = i3 & 8;
        if (i9 != 0) {
            i8 |= 3072;
        } else if ((i2 & 3072) == 0) {
            i8 |= c6956l.amazon(i) ? 2048 : 1024;
        }
        if ((i8 & 1171) == 1170 && c6956l.isVip()) {
            c6956l.m2124else();
        } else {
            c6956l.m2141switch();
            if ((i2 & 1) == 0 || c6956l.ad()) {
                if (i6 != 0) {
                    interfaceC12001l = C9885l.yandex;
                }
                if (i9 != 0) {
                    i = Alert.DURATION_SHOW_INDEFINITELY;
                }
            } else {
                c6956l.m2124else();
            }
            c6956l.adcel();
            c6956l.m2125final(1849434622);
            Object objM2132native = c6956l.m2132native();
            if (objM2132native == C1867l.yandex) {
                objM2132native = C15494l.f30290l;
                c6956l.m2147try(objM2132native);
            }
            byte b = 0;
            c6956l.startapp(false);
            Function0 function0 = (Function0) ((InterfaceC5059l) objM2132native);
            c6956l.m2125final(-1115894518);
            c6956l.m2125final(1886828752);
            if (!(c6956l.yandex instanceof C2416l)) {
                AbstractC8238l.amazon();
                throw null;
            }
            c6956l.m2131interface();
            if (c6956l.f14603switch) {
                c6956l.firebase(new C9632l(0, function0));
            } else {
                c6956l.m2136protected();
            }
            AbstractC8182l.billing(c6956l, str, new C14813l(b, i7));
            AbstractC8182l.billing(c6956l, interfaceC12001l, new C14813l(b, 17));
            AbstractC8182l.billing(c6956l, c12373l, new C14813l(b, 18));
            C14813l c14813l = new C14813l(b, 19);
            if (c6956l.f14603switch || !AbstractC8576l.yandex(c6956l.m2132native(), Integer.valueOf(i))) {
                c6956l.m2147try(Integer.valueOf(i));
                c6956l.loadAd(Integer.valueOf(i), c14813l);
            }
            AbstractC12900l.ads(c6956l, true, false, false);
        }
        final InterfaceC12001l interfaceC12001l2 = interfaceC12001l;
        final int i10 = i;
        C4224l c4224lAds = c6956l.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new Function2() { // from class: lؚٖ
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    AbstractC16570l.yandex(str, interfaceC12001l2, c12373l, i10, (C6956l) obj, AbstractC0545l.purchase(i2 | 1), i3);
                    return Unit.INSTANCE;
                }
            };
        }
    }
}
