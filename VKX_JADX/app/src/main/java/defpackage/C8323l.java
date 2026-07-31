package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function5;

/* JADX INFO: renamed from: lًۡٝ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C8323l implements Function5 {

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f17219l;

    public /* synthetic */ C8323l(int i) {
        this.f17219l = i;
    }

    @Override // kotlin.jvm.functions.Function5
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        int i;
        int i2;
        switch (this.f17219l) {
            case 0:
                InterfaceC5912l interfaceC5912l = (InterfaceC5912l) obj;
                InterfaceC15209l interfaceC15209l = (InterfaceC15209l) obj2;
                Function0 function0 = (Function0) obj3;
                C6956l c6956l = (C6956l) obj4;
                int iIntValue = ((Integer) obj5).intValue();
                if ((iIntValue & 6) == 0) {
                    i = iIntValue | ((iIntValue & 8) == 0 ? c6956l.billing(interfaceC5912l) : c6956l.admob(interfaceC5912l) ? 4 : 2);
                } else {
                    i = iIntValue;
                }
                if ((iIntValue & 48) == 0) {
                    i |= (iIntValue & 64) == 0 ? c6956l.billing(interfaceC15209l) : c6956l.admob(interfaceC15209l) ? 32 : 16;
                }
                if ((iIntValue & 384) == 0) {
                    i |= c6956l.admob(function0) ? 256 : 128;
                }
                if (c6956l.m2127for(i & 1, (i & 1171) != 1170)) {
                    AbstractC10216l.crashlytics(interfaceC5912l, interfaceC15209l, function0, c6956l, i & 1022);
                } else {
                    c6956l.m2124else();
                }
                break;
            case 1:
                InterfaceC5912l interfaceC5912l2 = (InterfaceC5912l) obj;
                InterfaceC15209l interfaceC15209l2 = (InterfaceC15209l) obj2;
                Function0 function1 = (Function0) obj3;
                C6956l c6956l2 = (C6956l) obj4;
                int iIntValue2 = ((Integer) obj5).intValue();
                if ((iIntValue2 & 6) == 0) {
                    i2 = iIntValue2 | ((iIntValue2 & 8) == 0 ? c6956l2.billing(interfaceC5912l2) : c6956l2.admob(interfaceC5912l2) ? 4 : 2);
                } else {
                    i2 = iIntValue2;
                }
                if ((iIntValue2 & 48) == 0) {
                    i2 |= (iIntValue2 & 64) == 0 ? c6956l2.billing(interfaceC15209l2) : c6956l2.admob(interfaceC15209l2) ? 32 : 16;
                }
                if ((iIntValue2 & 384) == 0) {
                    i2 |= c6956l2.admob(function1) ? 256 : 128;
                }
                if (c6956l2.m2127for(i2 & 1, (i2 & 1171) != 1170)) {
                    AbstractC10216l.crashlytics(interfaceC5912l2, interfaceC15209l2, function1, c6956l2, i2 & 1022);
                } else {
                    c6956l2.m2124else();
                }
                break;
            default:
                boolean zBooleanValue = ((Boolean) obj3).booleanValue();
                C12814l c12814l = (C12814l) obj5;
                String string = ((CharSequence) obj4).subSequence(C12814l.mopub(c12814l.yandex), C12814l.billing(c12814l.yandex)).toString();
                Intent intentPutExtra = new Intent().setAction("android.intent.action.PROCESS_TEXT").setType("text/plain").putExtra("android.intent.extra.PROCESS_TEXT_READONLY", zBooleanValue);
                ActivityInfo activityInfo = ((ResolveInfo) obj2).activityInfo;
                Intent className = intentPutExtra.setClassName(activityInfo.packageName, activityInfo.name);
                className.putExtra("android.intent.extra.PROCESS_TEXT", string);
                ((Context) obj).startActivity(className);
                break;
        }
        return Unit.INSTANCE;
    }
}
