package defpackage;

import android.content.SharedPreferences;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;

/* JADX INFO: renamed from: lُٜؑ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C10769l extends AbstractC5563l implements Function3 {

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public /* synthetic */ C15343l f21795l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final /* synthetic */ int f21796l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public /* synthetic */ C17213l f21797l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C10769l(int i, InterfaceC14029l interfaceC14029l, int i2) {
        super(i, interfaceC14029l);
        this.f21796l = i2;
    }

    @Override // defpackage.AbstractC12050l
    public final Object Signature(Object obj) {
        Integer numSignatures;
        Integer numSignatures2;
        Integer numSignatures3;
        Integer numSignatures4;
        String string;
        switch (this.f21796l) {
            case 0:
                C17213l c17213l = this.f21797l;
                C15343l c15343l = this.f21795l;
                AbstractC2829l.crashlytics(obj);
                SharedPreferences sharedPreferences = c17213l.yandex;
                SharedPreferences sharedPreferences2 = c17213l.yandex;
                c17213l.yandex("interface_accent");
                String string2 = sharedPreferences.getString("interface_accent", "0");
                int iIntValue = (string2 == null || (numSignatures4 = AbstractC16648l.signatures(string2)) == null) ? 0 : numSignatures4.intValue();
                c17213l.yandex("interface_theme");
                String string3 = sharedPreferences2.getString("interface_theme", "2");
                int iIntValue2 = 2;
                int iIntValue3 = (string3 == null || (numSignatures3 = AbstractC16648l.signatures(string3)) == null) ? 2 : numSignatures3.intValue();
                c17213l.yandex("theming_last_theme_dark");
                int i = sharedPreferences2.getInt("theming_last_theme_dark", 0);
                c17213l.yandex("theming_last_theme_light");
                int iIntValue4 = 1;
                int i2 = sharedPreferences2.getInt("theming_last_theme_light", 1);
                c17213l.yandex("interface_theme");
                String string4 = sharedPreferences2.getString("interface_theme", "2");
                if (string4 != null && (numSignatures2 = AbstractC16648l.signatures(string4)) != null) {
                    iIntValue2 = numSignatures2.intValue();
                }
                c17213l.yandex("interface_theme");
                String string5 = sharedPreferences2.getString("interface_theme", "1");
                if (string5 != null && (numSignatures = AbstractC16648l.signatures(string5)) != null) {
                    iIntValue4 = numSignatures.intValue();
                }
                return C15343l.loadAd(c15343l, iIntValue, iIntValue3, i2, iIntValue4, i, iIntValue2, false, false, false, false, null, 0, false, 16320);
            case 1:
                C17213l c17213l2 = this.f21797l;
                C15343l c15343l2 = this.f21795l;
                AbstractC2829l.crashlytics(obj);
                return C15343l.loadAd(c15343l2, 0, 0, 0, 0, 0, 0, false, c17213l2.crashlytics("a12_monet", false), c17213l2.crashlytics("a12_monet", false), c17213l2.crashlytics("ct_override", false), null, 0, false, 15423);
            default:
                C17213l c17213l3 = this.f21797l;
                C15343l c15343l3 = this.f21795l;
                AbstractC2829l.crashlytics(obj);
                LinkedHashMap linkedHashMapLoadAd = c17213l3.loadAd();
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Map.Entry entry : linkedHashMapLoadAd.entrySet()) {
                    if (AbstractC16648l.isVip((String) entry.getKey(), "tco_", false)) {
                        linkedHashMap.put(entry.getKey(), entry.getValue());
                    }
                }
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(AbstractC2200l.firebase(linkedHashMap.size()));
                for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                    linkedHashMap2.put(AbstractC12024l.m3334new((String) entry2.getKey(), "tco_"), entry2.getValue());
                }
                LinkedHashMap linkedHashMap3 = new LinkedHashMap(AbstractC2200l.firebase(linkedHashMap2.size()));
                for (Map.Entry entry3 : linkedHashMap2.entrySet()) {
                    Object key = entry3.getKey();
                    Object value = entry3.getValue();
                    if (value == null || (string = value.toString()) == null) {
                        string = "";
                    }
                    linkedHashMap3.put(key, string);
                }
                return C15343l.loadAd(c15343l3, 0, 0, 0, 0, 0, 0, false, false, false, false, linkedHashMap3, 0, false, 15359);
        }
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = 3;
        C17213l c17213l = (C17213l) obj;
        C15343l c15343l = (C15343l) obj2;
        InterfaceC14029l interfaceC14029l = (InterfaceC14029l) obj3;
        switch (this.f21796l) {
            case 0:
                C10769l c10769l = new C10769l(i, interfaceC14029l, 0);
                c10769l.f21797l = c17213l;
                c10769l.f21795l = c15343l;
                return c10769l.Signature(Unit.INSTANCE);
            case 1:
                C10769l c10769l2 = new C10769l(i, interfaceC14029l, 1);
                c10769l2.f21797l = c17213l;
                c10769l2.f21795l = c15343l;
                return c10769l2.Signature(Unit.INSTANCE);
            default:
                C10769l c10769l3 = new C10769l(i, interfaceC14029l, 2);
                c10769l3.f21797l = c17213l;
                c10769l3.f21795l = c15343l;
                return c10769l3.Signature(Unit.INSTANCE);
        }
    }
}
