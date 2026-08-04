package defpackage;

import androidx.car.app.model.Alert;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: lؚؓۖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C6994l implements InterfaceC6097l {
    public final boolean crashlytics;
    public final int loadAd;
    public final List yandex;

    public C6994l(List list) {
        boolean z;
        boolean z2;
        int i;
        this.yandex = list;
        Iterator it = list.iterator();
        int i2 = 0;
        while (true) {
            int iIntValue = 1;
            if (!it.hasNext()) {
                break;
            }
            Integer num = ((AbstractC3476l) it.next()).yandex;
            if (num != null) {
                iIntValue = num.intValue();
            }
            i2 += iIntValue;
        }
        this.loadAd = i2;
        List list2 = this.yandex;
        if (list2 != null && list2.isEmpty()) {
            z = false;
            break;
        }
        Iterator it2 = list2.iterator();
        while (true) {
            if (it2.hasNext()) {
                if (((AbstractC3476l) it2.next()).yandex == null) {
                    z = true;
                    break;
                }
            } else {
                z = false;
                break;
            }
        }
        this.crashlytics = z;
        List list3 = this.yandex;
        if (list3 != null && list3.isEmpty()) {
            z2 = true;
            break;
        }
        Iterator it3 = list3.iterator();
        while (true) {
            if (!it3.hasNext()) {
                z2 = true;
                break;
            }
            Integer num2 = ((AbstractC3476l) it3.next()).yandex;
            if (!((num2 != null ? num2.intValue() : Alert.DURATION_SHOW_INDEFINITELY) > 0)) {
                z2 = false;
                break;
            }
        }
        if (!z2) {
            C8339l.metrica("Failed requirement.");
            throw null;
        }
        List list4 = this.yandex;
        if ((list4 != null) && list4.isEmpty()) {
            i = 0;
        } else {
            Iterator it4 = list4.iterator();
            i = 0;
            while (it4.hasNext()) {
                if ((((AbstractC3476l) it4.next()).yandex == null) && (i = i + 1) < 0) {
                    AbstractC14055l.ads();
                    throw null;
                }
            }
        }
        if (i <= 1) {
            return;
        }
        List list5 = this.yandex;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list5) {
            if (((AbstractC3476l) obj).yandex == null) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(AbstractC14055l.billing(arrayList, 10));
        Iterator it5 = arrayList.iterator();
        while (it5.hasNext()) {
            arrayList2.add(((AbstractC3476l) it5.next()).loadAd);
        }
        C10754l.license(arrayList2, ". Parsing is undefined: for example, with variable-length month number and variable-length day of month, '111' can be parsed as Jan 11th or Nov 1st.", "At most one variable-length numeric field in a row is allowed, but got several: ");
        throw null;
    }

    public final String loadAd() {
        List<AbstractC3476l> list = this.yandex;
        ArrayList arrayList = new ArrayList(AbstractC14055l.billing(list, 10));
        for (AbstractC3476l abstractC3476l : list) {
            StringBuilder sb = new StringBuilder();
            Integer num = abstractC3476l.yandex;
            sb.append(num == null ? "at least one digit" : num + " digits");
            sb.append(" for ");
            sb.append(abstractC3476l.loadAd);
            arrayList.add(sb.toString());
        }
        boolean z = this.crashlytics;
        int i = this.loadAd;
        if (z) {
            return "a number with at least " + i + " digits: " + arrayList;
        }
        return "a number with exactly " + i + " digits: " + arrayList;
    }

    public final String toString() {
        return loadAd();
    }

    @Override // defpackage.InterfaceC6097l
    public final Object yandex(InterfaceC7697l interfaceC7697l, String str, int i) {
        int i2 = this.loadAd;
        if (i + i2 > str.length()) {
            return new C0876l(i, new C10740l(9, this));
        }
        C9987l c9987l = new C9987l();
        while (c9987l.f20387l + i < str.length() && AbstractC3230l.purchase(str.charAt(c9987l.f20387l + i))) {
            c9987l.f20387l++;
        }
        if (c9987l.f20387l < i2) {
            return new C0876l(i, new C9810l(c9987l, this, 23));
        }
        List list = this.yandex;
        int size = list.size();
        final int i3 = 0;
        while (i3 < size) {
            Integer num = ((AbstractC3476l) list.get(i3)).yandex;
            int iIntValue = (num != null ? num.intValue() : (c9987l.f20387l - i2) + 1) + i;
            final InterfaceC5066l interfaceC5066lYandex = ((AbstractC3476l) list.get(i3)).yandex(i, iIntValue, interfaceC7697l, str);
            if (interfaceC5066lYandex != null) {
                final String string = str.subSequence(i, iIntValue).toString();
                return new C0876l(i, new Function0() { // from class: lؙؓۦ
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        StringBuilder sbIsVip = AbstractC5020l.isVip("Can not interpret the string '", string, "' as ");
                        sbIsVip.append(((AbstractC3476l) this.yandex.get(i3)).loadAd);
                        sbIsVip.append(": ");
                        sbIsVip.append(interfaceC5066lYandex.isPro());
                        return sbIsVip.toString();
                    }
                });
            }
            i3++;
            i = iIntValue;
        }
        return Integer.valueOf(i);
    }
}
