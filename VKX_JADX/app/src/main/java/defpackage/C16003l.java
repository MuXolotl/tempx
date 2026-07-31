package defpackage;

import java.util.ArrayList;
import org.mongodb.kbson.BsonObjectId$Companion;

/* JADX INFO: renamed from: lٕۢٗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C16003l implements InterfaceC16588l {
    public static final InterfaceC18035l crashlytics;
    public static final InterfaceC16588l loadAd;
    public static final C16003l yandex = new C16003l();

    static {
        InterfaceC16588l interfaceC16588lSerializer = C17062l.Companion.serializer();
        loadAd = interfaceC16588lSerializer;
        crashlytics = interfaceC16588lSerializer.purchase();
    }

    public static void billing(InterfaceC17739l interfaceC17739l, C17918l c17918l) {
        if (!(interfaceC17739l instanceof C16044l)) {
            C6541l.firebase(AbstractC12900l.isPro("Unknown encoder type: ", interfaceC17739l));
        } else {
            loadAd.crashlytics(interfaceC17739l, new C17062l(c17918l));
        }
    }

    @Override // defpackage.InterfaceC16588l
    public final /* bridge */ /* synthetic */ void crashlytics(InterfaceC17739l interfaceC17739l, Object obj) {
        billing(interfaceC17739l, (C17918l) obj);
    }

    @Override // defpackage.InterfaceC16588l
    public final Object loadAd(InterfaceC10726l interfaceC10726l) {
        if (!(interfaceC10726l instanceof InterfaceC17487l)) {
            C6541l.firebase(AbstractC12900l.subs("Unknown decoder type: ", interfaceC10726l));
            return null;
        }
        C17062l c17062l = (C17062l) loadAd.loadAd(interfaceC10726l);
        c17062l.getClass();
        BsonObjectId$Companion bsonObjectId$Companion = C17918l.Companion;
        String str = c17062l.yandex;
        bsonObjectId$Companion.getClass();
        if (str.length() != 24) {
            C10754l.metrica(AbstractC14814l.smaato(']', "invalid hexadecimal representation of an ObjectId: [", str));
            return null;
        }
        if (str.length() % 2 == 0) {
            for (int i = 0; i < str.length(); i++) {
                char cCharAt = str.charAt(i);
                if (AbstractC8576l.subs(cCharAt, 48) < 0 || AbstractC8576l.subs(cCharAt, 57) > 0 || AbstractC8576l.subs(cCharAt, 97) < 0 || AbstractC8576l.subs(cCharAt, 102) > 0 || AbstractC8576l.subs(cCharAt, 65) < 0 || AbstractC8576l.subs(cCharAt, 70) > 0) {
                }
            }
            ArrayList<String> arrayListApplovin = AbstractC12024l.applovin(2, str);
            ArrayList arrayList = new ArrayList(AbstractC14055l.billing(arrayListApplovin, 10));
            for (String str2 : arrayListApplovin) {
                AbstractC8576l.loadAd(16);
                arrayList.add(Byte.valueOf((byte) Integer.parseInt(str2, 16)));
            }
            return BsonObjectId$Companion.yandex(AbstractC16901l.m4246transient(arrayList));
        }
        C10754l.metrica(AbstractC15560l.Signature("Invalid hexadecimal representation of an byte array: [", str, "]."));
        return null;
    }

    @Override // defpackage.InterfaceC16588l
    public final InterfaceC18035l purchase() {
        return crashlytics;
    }
}
