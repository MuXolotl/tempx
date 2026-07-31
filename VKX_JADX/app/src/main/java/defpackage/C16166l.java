package defpackage;

import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.Unit;

/* JADX INFO: renamed from: lٖؔ۠, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C16166l {
    public final /* synthetic */ AbstractActivityC14666l admob;
    public final LinkedHashMap yandex = new LinkedHashMap();
    public final LinkedHashMap loadAd = new LinkedHashMap();
    public final LinkedHashMap crashlytics = new LinkedHashMap();
    public final ArrayList amazon = new ArrayList();
    public final transient LinkedHashMap purchase = new LinkedHashMap();
    public final LinkedHashMap billing = new LinkedHashMap();
    public final Bundle mopub = new Bundle();

    public C16166l(AbstractActivityC14666l abstractActivityC14666l) {
        this.admob = abstractActivityC14666l;
    }

    public final void amazon(String str) {
        LinkedHashMap linkedHashMap = this.loadAd;
        if (((Integer) linkedHashMap.get(str)) != null) {
            return;
        }
        C7282l c7282l = new C7282l(1);
        for (Number number : new C6714l(new C6479l(c7282l, new C6199l(14, c7282l), 0))) {
            Integer numValueOf = Integer.valueOf(number.intValue());
            LinkedHashMap linkedHashMap2 = this.yandex;
            if (!linkedHashMap2.containsKey(numValueOf)) {
                int iIntValue = number.intValue();
                linkedHashMap2.put(Integer.valueOf(iIntValue), str);
                linkedHashMap.put(str, Integer.valueOf(iIntValue));
                return;
            }
        }
        C1759l.firebase("Sequence contains no element matching the predicate.");
    }

    public final C12840l crashlytics(String str, C17423l c17423l, InterfaceC18517l interfaceC18517l) {
        amazon(str);
        this.purchase.put(str, new C1129l(interfaceC18517l, c17423l));
        LinkedHashMap linkedHashMap = this.billing;
        if (linkedHashMap.containsKey(str)) {
            Object obj = linkedHashMap.get(str);
            linkedHashMap.remove(str);
            interfaceC18517l.isPro(obj);
        }
        Bundle bundle = this.mopub;
        C6597l c6597l = (C6597l) AbstractC17653l.amazon(str, bundle);
        if (c6597l != null) {
            bundle.remove(str);
            interfaceC18517l.isPro(c17423l.admob(c6597l.f13815l, c6597l.f13816l));
        }
        return new C12840l(this, str, c17423l, 1);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:4:0x000a  */
    public final void loadAd(int i, C17423l c17423l, Object obj) {
        C3316l c3316l;
        int i2;
        int i3 = c17423l.yandex;
        int i4 = 2;
        Bundle bundleExtra = null;
        AbstractActivityC14666l abstractActivityC14666l = this.admob;
        switch (i3) {
            case 0:
                c3316l = null;
                break;
            case 1:
                c3316l = null;
                break;
            case 2:
                String[] strArr = (String[]) obj;
                if (strArr.length == 0) {
                    c3316l = new C3316l(i4, C14054l.f27396l);
                } else {
                    int length = strArr.length;
                    int i5 = 0;
                    while (true) {
                        if (i5 >= length) {
                            int iFirebase = AbstractC2200l.firebase(strArr.length);
                            if (iFirebase < 16) {
                                iFirebase = 16;
                            }
                            LinkedHashMap linkedHashMap = new LinkedHashMap(iFirebase);
                            for (String str : strArr) {
                                linkedHashMap.put(str, Boolean.TRUE);
                            }
                            c3316l = new C3316l(i4, linkedHashMap);
                        } else if (AbstractC7720l.loadAd(abstractActivityC14666l, strArr[i5]) != 0) {
                            c3316l = null;
                        } else {
                            i5++;
                        }
                    }
                }
                break;
            case 3:
                if (AbstractC7720l.loadAd(abstractActivityC14666l, (String) obj) == 0) {
                    c3316l = new C3316l(i4, Boolean.TRUE);
                } else {
                    c3316l = null;
                }
                break;
            default:
                c3316l = null;
                break;
        }
        if (c3316l != null) {
            new Handler(Looper.getMainLooper()).post(new RunnableC2027l(this, i, c3316l, 1));
            return;
        }
        Intent intentAmazon = c17423l.amazon(abstractActivityC14666l, obj);
        if (intentAmazon.getExtras() != null && intentAmazon.getExtras().getClassLoader() == null) {
            intentAmazon.setExtrasClassLoader(abstractActivityC14666l.getClassLoader());
        }
        if (intentAmazon.hasExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) {
            bundleExtra = intentAmazon.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
            intentAmazon.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
        }
        Bundle bundle = bundleExtra;
        if ("androidx.activity.result.contract.action.REQUEST_PERMISSIONS".equals(intentAmazon.getAction())) {
            String[] stringArrayExtra = intentAmazon.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
            if (stringArrayExtra == null) {
                stringArrayExtra = new String[0];
            }
            AbstractC7720l.billing(abstractActivityC14666l, stringArrayExtra, i);
            return;
        }
        if (!"androidx.activity.result.contract.action.INTENT_SENDER_REQUEST".equals(intentAmazon.getAction())) {
            abstractActivityC14666l.startActivityForResult(intentAmazon, i, bundle);
            return;
        }
        C12185l c12185l = (C12185l) intentAmazon.getParcelableExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST");
        try {
            i2 = i;
            try {
                abstractActivityC14666l.startIntentSenderForResult(c12185l.f24205l, i2, c12185l.f24204l, c12185l.f24203l, c12185l.f24206l, 0, bundle);
                Unit unit = Unit.INSTANCE;
            } catch (IntentSender.SendIntentException e) {
                e = e;
                new Handler(Looper.getMainLooper()).post(new RunnableC2027l(this, i2, e, i4));
            }
        } catch (IntentSender.SendIntentException e2) {
            e = e2;
            i2 = i;
        }
    }

    public final void purchase(String str) {
        Integer num;
        if (!this.amazon.contains(str) && (num = (Integer) this.loadAd.remove(str)) != null) {
            this.yandex.remove(num);
        }
        this.purchase.remove(str);
        LinkedHashMap linkedHashMap = this.billing;
        if (linkedHashMap.containsKey(str)) {
            StringBuilder sbIsVip = AbstractC5020l.isVip("Dropping pending result for request ", str, ": ");
            sbIsVip.append(linkedHashMap.get(str));
            Log.w("ActivityResultRegistry", sbIsVip.toString());
            linkedHashMap.remove(str);
        }
        Bundle bundle = this.mopub;
        if (bundle.containsKey(str)) {
            Log.w("ActivityResultRegistry", "Dropping pending result for request " + str + ": " + ((C6597l) AbstractC17653l.amazon(str, bundle)));
            bundle.remove(str);
        }
        LinkedHashMap linkedHashMap2 = this.crashlytics;
        C11546l c11546l = (C11546l) linkedHashMap2.get(str);
        if (c11546l != null) {
            ArrayList arrayList = c11546l.loadAd;
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                c11546l.yandex.loadAd((InterfaceC13342l) it.next());
            }
            arrayList.clear();
            linkedHashMap2.remove(str);
        }
    }

    public final boolean yandex(int i, int i2, Intent intent) {
        String str = (String) this.yandex.get(Integer.valueOf(i));
        if (str == null) {
            return false;
        }
        C1129l c1129l = (C1129l) this.purchase.get(str);
        if ((c1129l != null ? c1129l.yandex : null) != null) {
            ArrayList arrayList = this.amazon;
            if (arrayList.contains(str)) {
                c1129l.yandex.isPro(c1129l.loadAd.admob(intent, i2));
                arrayList.remove(str);
                return true;
            }
        }
        this.billing.remove(str);
        this.mopub.putParcelable(str, new C6597l(intent, i2));
        return true;
    }
}
