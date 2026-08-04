package defpackage;

import android.content.ClipData;
import android.os.Parcel;
import android.text.Annotation;
import android.text.Spanned;
import android.util.Base64;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: lّٗۤ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C17092l extends AbstractC5563l implements Function2 {

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public final /* synthetic */ C16173l f33261l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final /* synthetic */ int f33262l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public int f33263l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C17092l(C16173l c16173l, InterfaceC14029l interfaceC14029l, int i) {
        super(2, interfaceC14029l);
        this.f33262l = i;
        this.f33261l = c16173l;
    }

    /* JADX WARN: Code duplicated, block: B:181:0x0368  */
    /* JADX WARN: Code duplicated, block: B:184:0x036f  */
    /* JADX WARN: Code duplicated, block: B:86:0x01b5  */
    @Override // defpackage.AbstractC12050l
    public final Object Signature(Object obj) {
        int i;
        C3625l c3625lCrashlytics;
        Object c11848l;
        Object c3625l;
        CharSequence text;
        int i2;
        C3625l c3625l2;
        int i3 = this.f33262l;
        EnumC7170l enumC7170l = EnumC7170l.f15004l;
        EnumC9342l enumC9342l = EnumC9342l.f19165l;
        C16173l c16173l = this.f33261l;
        byte b = 1;
        switch (i3) {
            case 0:
                int i4 = this.f33263l;
                if (i4 != 0) {
                    if (i4 == 1) {
                        AbstractC2829l.crashlytics(obj);
                    } else {
                        if (i4 != 2) {
                            C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        AbstractC2829l.crashlytics(obj);
                    }
                    return Unit.INSTANCE;
                }
                AbstractC2829l.crashlytics(obj);
                this.f33263l = 1;
                if (c16173l.subscription(this) == enumC9342l) {
                    return enumC9342l;
                }
                C8195l c8195lYandex = C16173l.yandex(c16173l);
                if (c8195lYandex != null) {
                    String str = (String) c8195lYandex.f17098l;
                    long j = ((C12814l) c8195lYandex.f17097l).yandex;
                    InterfaceC13515l interfaceC13515l = c16173l.subs;
                    if (interfaceC13515l != null) {
                        this.f33263l = 2;
                        Object objPurchase = ((C11528l) interfaceC13515l).purchase(str, j, this);
                        if (objPurchase != enumC9342l) {
                            objPurchase = Unit.INSTANCE;
                        }
                        if (objPurchase == enumC9342l) {
                            return enumC9342l;
                        }
                    }
                }
                return Unit.INSTANCE;
            case 1:
                int i5 = this.f33263l;
                if (i5 == 0) {
                    AbstractC2829l.crashlytics(obj);
                    if (C12814l.amazon(c16173l.vip().loadAd) || !c16173l.isPro()) {
                        i = 1;
                        c3625lCrashlytics = null;
                    } else {
                        c3625lCrashlytics = AbstractC15439l.crashlytics(c16173l.vip());
                        C3625l c3625lPurchase = AbstractC15439l.purchase(c16173l.vip(), c16173l.vip().yandex.f7563l.length());
                        C3625l c3625lAmazon = AbstractC15439l.amazon(c16173l.vip(), c16173l.vip().yandex.f7563l.length());
                        C18734l c18734l = new C18734l(c3625lPurchase);
                        c18734l.yandex(c3625lAmazon);
                        C3625l c3625lBilling = c18734l.billing();
                        int iMopub = C12814l.mopub(c16173l.vip().loadAd);
                        c16173l.crashlytics.invoke(C16173l.purchase(c3625lBilling, AbstractC2296l.loadAd(iMopub, iMopub)));
                        c16173l.adcel(enumC7170l);
                        i = 1;
                        c16173l.yandex.purchase = true;
                    }
                    if (c3625lCrashlytics == null) {
                        return Unit.INSTANCE;
                    }
                    InterfaceC7948l interfaceC7948l = c16173l.mopub;
                    if (interfaceC7948l != null) {
                        C11848l c11848lAmazon = AbstractC3124l.amazon(c3625lCrashlytics);
                        this.f33263l = i;
                        if (((C8231l) interfaceC7948l).yandex(c11848lAmazon) == enumC9342l) {
                            return enumC9342l;
                        }
                    }
                } else {
                    if (i5 != 1) {
                        C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    AbstractC2829l.crashlytics(obj);
                }
                return Unit.INSTANCE;
            default:
                int i6 = this.f33263l;
                if (i6 == 0) {
                    AbstractC2829l.crashlytics(obj);
                    InterfaceC7948l interfaceC7948l2 = c16173l.mopub;
                    if (interfaceC7948l2 != null) {
                        this.f33263l = 1;
                        ClipData primaryClip = ((C8231l) interfaceC7948l2).yandex.yandex().getPrimaryClip();
                        c11848l = primaryClip != null ? new C11848l(primaryClip) : null;
                        if (c11848l == enumC9342l) {
                            return enumC9342l;
                        }
                    }
                    return Unit.INSTANCE;
                }
                if (i6 == 1) {
                    AbstractC2829l.crashlytics(obj);
                    c11848l = obj;
                } else {
                    if (i6 != 2) {
                        C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    AbstractC2829l.crashlytics(obj);
                    c3625l = obj;
                    enumC7170l = enumC7170l;
                }
                c3625l2 = (C3625l) c3625l;
                if (c3625l2 != null) {
                    if (c16173l.isPro()) {
                        C18734l c18734l2 = new C18734l(AbstractC15439l.purchase(c16173l.vip(), c16173l.vip().yandex.f7563l.length()));
                        c18734l2.yandex(c3625l2);
                        C3625l c3625lBilling2 = c18734l2.billing();
                        C3625l c3625lAmazon2 = AbstractC15439l.amazon(c16173l.vip(), c16173l.vip().yandex.f7563l.length());
                        C18734l c18734l3 = new C18734l(c3625lBilling2);
                        c18734l3.yandex(c3625lAmazon2);
                        C3625l c3625lBilling3 = c18734l3.billing();
                        int length = c3625l2.f7563l.length() + C12814l.mopub(c16173l.vip().loadAd);
                        c16173l.crashlytics.invoke(C16173l.purchase(c3625lBilling3, AbstractC2296l.loadAd(length, length)));
                        c16173l.adcel(enumC7170l);
                        c16173l.yandex.purchase = true;
                    }
                    return Unit.INSTANCE;
                }
                return Unit.INSTANCE;
                C11848l c11848l2 = (C11848l) c11848l;
                if (c11848l2 != null) {
                    this.f33263l = 2;
                    int i7 = 0;
                    ClipData.Item itemAt = c11848l2.yandex.getItemAt(0);
                    if (itemAt == null || (text = itemAt.getText()) == null) {
                        enumC7170l = enumC7170l;
                        c3625l = null;
                    } else if (text instanceof Spanned) {
                        Spanned spanned = (Spanned) text;
                        Annotation[] annotationArr = (Annotation[]) spanned.getSpans(0, spanned.length(), Annotation.class);
                        ArrayList arrayList = new ArrayList();
                        int length2 = annotationArr.length - 1;
                        if (length2 >= 0) {
                            int i8 = 0;
                            while (true) {
                                Annotation annotation = annotationArr[i8];
                                if (AbstractC8576l.yandex(annotation.getKey(), "androidx.compose.text.SpanStyle")) {
                                    int spanStart = spanned.getSpanStart(annotation);
                                    int spanEnd = spanned.getSpanEnd(annotation);
                                    String value = annotation.getValue();
                                    Parcel parcelObtain = Parcel.obtain();
                                    byte[] bArrDecode = Base64.decode(value, i7);
                                    parcelObtain.unmarshall(bArrDecode, i7, bArrDecode.length);
                                    parcelObtain.setDataPosition(i7);
                                    long j2 = C9735l.firebase;
                                    long j3 = j2;
                                    long jFirebase = C1794l.crashlytics;
                                    long jFirebase2 = jFirebase;
                                    C6886l c6886l = null;
                                    C11617l c11617l = null;
                                    C8689l c8689l = null;
                                    String string = null;
                                    C10524l c10524l = null;
                                    C16810l c16810l = null;
                                    C9867l c9867l = null;
                                    C0387l c0387l = null;
                                    while (true) {
                                        if (parcelObtain.dataAvail() > b) {
                                            byte b2 = parcelObtain.readByte();
                                            if (b2 != b) {
                                                i7 = i7;
                                                enumC7170l = enumC7170l;
                                                if (b2 != 2) {
                                                    parcelObtain = parcelObtain;
                                                    if (b2 == 3) {
                                                        if (parcelObtain.dataAvail() >= 4) {
                                                            c6886l = new C6886l(parcelObtain.readInt());
                                                            parcelObtain = parcelObtain;
                                                            enumC7170l = enumC7170l;
                                                            b = 1;
                                                            i7 = i7;
                                                        }
                                                    } else if (b2 == 4) {
                                                        b = 1;
                                                        if (parcelObtain.dataAvail() >= 1) {
                                                            byte b3 = parcelObtain.readByte();
                                                            C11617l c11617l2 = new C11617l((b3 != 0 && b3 == 1) ? 1 : i7);
                                                            i7 = i7;
                                                            c11617l = c11617l2;
                                                            parcelObtain = parcelObtain;
                                                            enumC7170l = enumC7170l;
                                                        }
                                                    } else if (b2 != 5) {
                                                        if (b2 == 6) {
                                                            string = parcelObtain.readString();
                                                        } else if (b2 == 7) {
                                                            if (parcelObtain.dataAvail() >= 5) {
                                                                byte b4 = parcelObtain.readByte();
                                                                long j4 = b4 == 1 ? 4294967296L : b4 == 2 ? 8589934592L : 0L;
                                                                jFirebase2 = C12735l.yandex(j4, 0L) ? C1794l.crashlytics : AbstractC7039l.firebase(parcelObtain.readFloat(), j4);
                                                            }
                                                        } else if (b2 == 8) {
                                                            if (parcelObtain.dataAvail() >= 4) {
                                                                c10524l = new C10524l(parcelObtain.readFloat());
                                                                parcelObtain = parcelObtain;
                                                                b = 1;
                                                            }
                                                        } else if (b2 == 9) {
                                                            if (parcelObtain.dataAvail() >= 8) {
                                                                c16810l = new C16810l(parcelObtain.readFloat(), parcelObtain.readFloat());
                                                                parcelObtain = parcelObtain;
                                                                enumC7170l = enumC7170l;
                                                                b = 1;
                                                                i7 = i7;
                                                            }
                                                        } else if (b2 == 10) {
                                                            if (parcelObtain.dataAvail() >= 8) {
                                                                int i9 = C9735l.smaato;
                                                                long j5 = parcelObtain.readLong();
                                                                long j6 = j5 & 63;
                                                                if (j6 >= 16) {
                                                                    j5 = (j5 & (-64)) | (j6 + 1);
                                                                }
                                                                j3 = j5;
                                                            }
                                                        } else if (b2 != 11) {
                                                            if (b2 == 12) {
                                                                if (parcelObtain.dataAvail() >= 20) {
                                                                    int i10 = C9735l.smaato;
                                                                    long j7 = parcelObtain.readLong();
                                                                    long j8 = j7 & 63;
                                                                    if (j8 >= 16) {
                                                                        j7 = (j7 & (-64)) | (j8 + 1);
                                                                    }
                                                                    i7 = i7;
                                                                    parcelObtain = parcelObtain;
                                                                    c0387l = new C0387l(j7, (((long) Float.floatToRawIntBits(parcelObtain.readFloat())) << 32) | (((long) Float.floatToRawIntBits(parcelObtain.readFloat())) & 4294967295L), parcelObtain.readFloat());
                                                                }
                                                            }
                                                            b = 1;
                                                        } else if (parcelObtain.dataAvail() >= 4) {
                                                            int i11 = parcelObtain.readInt();
                                                            int i12 = (i11 & 2) != 0 ? 1 : i7;
                                                            int i13 = (i11 & 1) != 0 ? 1 : i7;
                                                            C9867l c9867l2 = C9867l.amazon;
                                                            C9867l c9867l3 = C9867l.crashlytics;
                                                            if (i12 != 0 && i13 != 0) {
                                                                C9867l[] c9867lArr = new C9867l[2];
                                                                c9867lArr[i7] = c9867l2;
                                                                c9867lArr[1] = c9867l3;
                                                                List listRemoteconfig = AbstractC14055l.remoteconfig(c9867lArr);
                                                                Integer numValueOf = Integer.valueOf(i7);
                                                                int size = listRemoteconfig.size();
                                                                for (int i14 = i7; i14 < size; i14++) {
                                                                    numValueOf = Integer.valueOf(numValueOf.intValue() | ((C9867l) listRemoteconfig.get(i14)).yandex);
                                                                }
                                                                c9867l = new C9867l(numValueOf.intValue());
                                                            } else if (i12 != 0) {
                                                                c9867l = c9867l2;
                                                            } else {
                                                                c9867l = i13 != 0 ? c9867l3 : C9867l.loadAd;
                                                            }
                                                        }
                                                        parcelObtain = parcelObtain;
                                                        b = 1;
                                                    } else if (parcelObtain.dataAvail() >= 1) {
                                                        byte b5 = parcelObtain.readByte();
                                                        if (b5 == 0) {
                                                            i2 = i7;
                                                        } else if (b5 == 1) {
                                                            i2 = 65535;
                                                        } else if (b5 == 3) {
                                                            i2 = 2;
                                                        } else if (b5 == 2) {
                                                            i2 = 1;
                                                        } else {
                                                            i2 = i7;
                                                        }
                                                        c8689l = new C8689l(i2);
                                                        parcelObtain = parcelObtain;
                                                        b = 1;
                                                    }
                                                } else if (parcelObtain.dataAvail() >= 5) {
                                                    byte b6 = parcelObtain.readByte();
                                                    long j9 = b6 == b ? 4294967296L : b6 == 2 ? 8589934592L : 0L;
                                                    jFirebase = C12735l.yandex(j9, 0L) ? C1794l.crashlytics : AbstractC7039l.firebase(parcelObtain.readFloat(), j9);
                                                    parcelObtain = parcelObtain;
                                                    b = 1;
                                                }
                                                c3625l2 = (C3625l) c3625l;
                                                if (c3625l2 != null) {
                                                    if (c16173l.isPro()) {
                                                        C18734l c18734l4 = new C18734l(AbstractC15439l.purchase(c16173l.vip(), c16173l.vip().yandex.f7563l.length()));
                                                        c18734l4.yandex(c3625l2);
                                                        C3625l c3625lBilling4 = c18734l4.billing();
                                                        C3625l c3625lAmazon3 = AbstractC15439l.amazon(c16173l.vip(), c16173l.vip().yandex.f7563l.length());
                                                        C18734l c18734l5 = new C18734l(c3625lBilling4);
                                                        c18734l5.yandex(c3625lAmazon3);
                                                        C3625l c3625lBilling5 = c18734l5.billing();
                                                        int length3 = c3625l2.f7563l.length() + C12814l.mopub(c16173l.vip().loadAd);
                                                        c16173l.crashlytics.invoke(C16173l.purchase(c3625lBilling5, AbstractC2296l.loadAd(length3, length3)));
                                                        c16173l.adcel(enumC7170l);
                                                        c16173l.yandex.purchase = true;
                                                    }
                                                    return Unit.INSTANCE;
                                                }
                                            } else if (parcelObtain.dataAvail() >= 8) {
                                                int i15 = C9735l.smaato;
                                                long j10 = parcelObtain.readLong();
                                                long j11 = j10 & 63;
                                                j2 = j11 < 16 ? j10 : (j10 & (-64)) | (j11 + 1);
                                            }
                                        }
                                        i7 = i7;
                                        enumC7170l = enumC7170l;
                                    }
                                    arrayList.add(new C15012l(new C14264l(j2, jFirebase, c6886l, c11617l, c8689l, null, string, jFirebase2, c10524l, c16810l, null, j3, c9867l, c0387l, 49152), spanStart, spanEnd));
                                } else {
                                    i7 = i7;
                                    enumC7170l = enumC7170l;
                                }
                                if (i8 != length2) {
                                    i8++;
                                    i7 = i7;
                                    enumC7170l = enumC7170l;
                                    b = 1;
                                }
                            }
                        } else {
                            enumC7170l = enumC7170l;
                        }
                        String string2 = text.toString();
                        C3625l c3625l3 = AbstractC0255l.yandex;
                        c3625l = new C3625l(arrayList.isEmpty() ? null : arrayList, string2);
                    } else {
                        c3625l = new C3625l(text.toString());
                        enumC7170l = enumC7170l;
                    }
                    if (c3625l == enumC9342l) {
                        return enumC9342l;
                    }
                    c3625l2 = (C3625l) c3625l;
                    if (c3625l2 != null) {
                        if (c16173l.isPro()) {
                            C18734l c18734l6 = new C18734l(AbstractC15439l.purchase(c16173l.vip(), c16173l.vip().yandex.f7563l.length()));
                            c18734l6.yandex(c3625l2);
                            C3625l c3625lBilling6 = c18734l6.billing();
                            C3625l c3625lAmazon4 = AbstractC15439l.amazon(c16173l.vip(), c16173l.vip().yandex.f7563l.length());
                            C18734l c18734l7 = new C18734l(c3625lBilling6);
                            c18734l7.yandex(c3625lAmazon4);
                            C3625l c3625lBilling7 = c18734l7.billing();
                            int length4 = c3625l2.f7563l.length() + C12814l.mopub(c16173l.vip().loadAd);
                            c16173l.crashlytics.invoke(C16173l.purchase(c3625lBilling7, AbstractC2296l.loadAd(length4, length4)));
                            c16173l.adcel(enumC7170l);
                            c16173l.yandex.purchase = true;
                        }
                        return Unit.INSTANCE;
                    }
                }
                return Unit.INSTANCE;
        }
    }

    @Override // defpackage.AbstractC12050l
    public final InterfaceC14029l ads(InterfaceC14029l interfaceC14029l, Object obj) {
        int i = this.f33262l;
        C16173l c16173l = this.f33261l;
        switch (i) {
            case 0:
                return new C17092l(c16173l, interfaceC14029l, 0);
            case 1:
                return new C17092l(c16173l, interfaceC14029l, 1);
            default:
                return new C17092l(c16173l, interfaceC14029l, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f33262l) {
            case 0:
                long j = ((C1187l) obj).yandex;
                return new C17092l(this.f33261l, (InterfaceC14029l) obj2, 0).Signature(Unit.INSTANCE);
            case 1:
                return ((C17092l) ads((InterfaceC14029l) obj2, (InterfaceC2262l) obj)).Signature(Unit.INSTANCE);
            default:
                return ((C17092l) ads((InterfaceC14029l) obj2, (InterfaceC2262l) obj)).Signature(Unit.INSTANCE);
        }
    }
}
