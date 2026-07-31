package defpackage;

import android.net.Uri;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Process;
import android.util.Log;
import android.util.Pair;
import com.google.common.util.concurrent.ListenableFuture;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: renamed from: lٌٗۤ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public class C17516l implements InterfaceC11545l, InterfaceC17641l, InterfaceC0643l, InterfaceC9526l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public Object f34133l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final Object f34134l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f34135l;

    public C17516l() {
        this.f34135l = 2;
        this.f34134l = new HashMap();
        this.f34133l = new C15100l(6);
        C15100l c15100l = new C15100l(0);
        EnumC14263l enumC14263l = EnumC14263l.BITWISE_AND;
        ArrayList arrayList = c15100l.yandex;
        arrayList.add(enumC14263l);
        arrayList.add(EnumC14263l.BITWISE_LEFT_SHIFT);
        arrayList.add(EnumC14263l.BITWISE_NOT);
        arrayList.add(EnumC14263l.BITWISE_OR);
        arrayList.add(EnumC14263l.BITWISE_RIGHT_SHIFT);
        arrayList.add(EnumC14263l.BITWISE_UNSIGNED_RIGHT_SHIFT);
        arrayList.add(EnumC14263l.BITWISE_XOR);
        amazon(c15100l);
        C15100l c15100l2 = new C15100l(1);
        EnumC14263l enumC14263l2 = EnumC14263l.EQUALS;
        ArrayList arrayList2 = c15100l2.yandex;
        arrayList2.add(enumC14263l2);
        arrayList2.add(EnumC14263l.GREATER_THAN);
        arrayList2.add(EnumC14263l.GREATER_THAN_EQUALS);
        arrayList2.add(EnumC14263l.IDENTITY_EQUALS);
        arrayList2.add(EnumC14263l.IDENTITY_NOT_EQUALS);
        arrayList2.add(EnumC14263l.LESS_THAN);
        arrayList2.add(EnumC14263l.LESS_THAN_EQUALS);
        arrayList2.add(EnumC14263l.NOT_EQUALS);
        amazon(c15100l2);
        C15100l c15100l3 = new C15100l(2);
        EnumC14263l enumC14263l3 = EnumC14263l.APPLY;
        ArrayList arrayList3 = c15100l3.yandex;
        arrayList3.add(enumC14263l3);
        arrayList3.add(EnumC14263l.BLOCK);
        arrayList3.add(EnumC14263l.BREAK);
        arrayList3.add(EnumC14263l.CASE);
        arrayList3.add(EnumC14263l.DEFAULT);
        arrayList3.add(EnumC14263l.CONTINUE);
        arrayList3.add(EnumC14263l.DEFINE_FUNCTION);
        arrayList3.add(EnumC14263l.FN);
        arrayList3.add(EnumC14263l.IF);
        arrayList3.add(EnumC14263l.QUOTE);
        arrayList3.add(EnumC14263l.RETURN);
        arrayList3.add(EnumC14263l.SWITCH);
        arrayList3.add(EnumC14263l.TERNARY);
        amazon(c15100l3);
        C15100l c15100l4 = new C15100l(3);
        EnumC14263l enumC14263l4 = EnumC14263l.AND;
        ArrayList arrayList4 = c15100l4.yandex;
        arrayList4.add(enumC14263l4);
        arrayList4.add(EnumC14263l.NOT);
        arrayList4.add(EnumC14263l.OR);
        amazon(c15100l4);
        C15100l c15100l5 = new C15100l(4);
        EnumC14263l enumC14263l5 = EnumC14263l.FOR_IN;
        ArrayList arrayList5 = c15100l5.yandex;
        arrayList5.add(enumC14263l5);
        arrayList5.add(EnumC14263l.FOR_IN_CONST);
        arrayList5.add(EnumC14263l.FOR_IN_LET);
        arrayList5.add(EnumC14263l.FOR_LET);
        arrayList5.add(EnumC14263l.FOR_OF);
        arrayList5.add(EnumC14263l.FOR_OF_CONST);
        arrayList5.add(EnumC14263l.FOR_OF_LET);
        arrayList5.add(EnumC14263l.WHILE);
        amazon(c15100l5);
        C15100l c15100l6 = new C15100l(5);
        EnumC14263l enumC14263l6 = EnumC14263l.ADD;
        ArrayList arrayList6 = c15100l6.yandex;
        arrayList6.add(enumC14263l6);
        arrayList6.add(EnumC14263l.DIVIDE);
        arrayList6.add(EnumC14263l.MODULUS);
        arrayList6.add(EnumC14263l.MULTIPLY);
        arrayList6.add(EnumC14263l.NEGATE);
        arrayList6.add(EnumC14263l.POST_DECREMENT);
        arrayList6.add(EnumC14263l.POST_INCREMENT);
        arrayList6.add(EnumC14263l.PRE_DECREMENT);
        arrayList6.add(EnumC14263l.PRE_INCREMENT);
        arrayList6.add(EnumC14263l.SUBTRACT);
        amazon(c15100l6);
        C15100l c15100l7 = new C15100l(7);
        EnumC14263l enumC14263l7 = EnumC14263l.ASSIGN;
        ArrayList arrayList7 = c15100l7.yandex;
        arrayList7.add(enumC14263l7);
        arrayList7.add(EnumC14263l.CONST);
        arrayList7.add(EnumC14263l.CREATE_ARRAY);
        arrayList7.add(EnumC14263l.CREATE_OBJECT);
        arrayList7.add(EnumC14263l.EXPRESSION_LIST);
        arrayList7.add(EnumC14263l.GET);
        arrayList7.add(EnumC14263l.GET_INDEX);
        arrayList7.add(EnumC14263l.GET_PROPERTY);
        arrayList7.add(EnumC14263l.NULL);
        arrayList7.add(EnumC14263l.SET_PROPERTY);
        arrayList7.add(EnumC14263l.TYPEOF);
        arrayList7.add(EnumC14263l.UNDEFINED);
        arrayList7.add(EnumC14263l.VAR);
        amazon(c15100l7);
    }

    @Override // defpackage.InterfaceC11545l
    public void accept(Object obj, Object obj2) {
        Pair pairCreate;
        switch (this.f34135l) {
            case 1:
                BinderC8187l binderC8187l = new BinderC8187l((C7560l) this.f34134l, (C2350l) obj2, 0);
                C2333l c2333l = (C2333l) ((C8963l) obj).metrica();
                C7794l c7794l = (C7794l) this.f34133l;
                Parcel parcelCrashlytics = c2333l.crashlytics();
                int i = AbstractC1763l.yandex;
                parcelCrashlytics.writeStrongBinder(binderC8187l);
                AbstractC1763l.loadAd(parcelCrashlytics, c7794l);
                c2333l.isPro(parcelCrashlytics, 1);
                return;
            default:
                C11963l c11963l = (C11963l) obj;
                C13132l c13132l = new C13132l((C2350l) obj2);
                String[] strArr = {(String) this.f34134l};
                C10815l c10815l = (C10815l) this.f34133l;
                c11963l.getClass();
                try {
                    int i2 = c10815l.loadAd;
                    if (i2 == 1) {
                        C17484l c17484l = new C17484l();
                        c17484l.f34065l = -1L;
                        c17484l.f34064l = 0L;
                        c17484l.f34060l = false;
                        c17484l.f34063l = 0L;
                        c17484l.f34059l = c10815l.yandex;
                        c17484l.f34058l = i2;
                        byte[] bArr = c10815l.crashlytics;
                        if (bArr == null || bArr.length <= 32768) {
                            c17484l.f34055l = bArr;
                        } else {
                            C16917l c16917l = new C16917l();
                            c16917l.f32994l = bArr;
                            c17484l.f34066l = c16917l;
                            c17484l.f34055l = Arrays.copyOf(bArr, 32768);
                        }
                        pairCreate = Pair.create(c17484l, C15433l.f30188l);
                    } else if (i2 == 2) {
                        C0093l c0093l = c10815l.amazon;
                        if (c0093l == null) {
                            throw new NullPointerException("File cannot be null for Payload.Type.FILE");
                        }
                        File file = (File) c0093l.f1005l;
                        String absolutePath = file == null ? null : file.getAbsolutePath();
                        Uri uri = (Uri) c0093l.f1007l;
                        C17484l c17484l2 = new C17484l();
                        c17484l2.f34059l = c10815l.yandex;
                        c17484l2.f34058l = c10815l.loadAd;
                        c17484l2.f34062l = (ParcelFileDescriptor) c0093l.f1004l;
                        c17484l2.f34057l = uri;
                        c17484l2.f34061l = absolutePath;
                        c17484l2.f34065l = c0093l.f1006l;
                        c17484l2.f34064l = 0L;
                        c17484l2.f34060l = false;
                        c17484l2.f34063l = c10815l.billing;
                        c17484l2.f34054l = c10815l.mopub;
                        c17484l2.f34067l = c10815l.admob;
                        pairCreate = Pair.create(c17484l2, C15433l.f30188l);
                    } else {
                        if (i2 != 3) {
                            IllegalArgumentException illegalArgumentException = new IllegalArgumentException(String.format("Outgoing Payload %d has unknown type %d", Long.valueOf(c10815l.yandex), Integer.valueOf(c10815l.loadAd)));
                            Log.wtf("NearbyConnections", "Unknown payload type!", illegalArgumentException);
                            throw illegalArgumentException;
                        }
                        try {
                            ParcelFileDescriptor[] parcelFileDescriptorArrCreatePipe = ParcelFileDescriptor.createPipe();
                            ParcelFileDescriptor[] parcelFileDescriptorArrCreatePipe2 = ParcelFileDescriptor.createPipe();
                            C17484l c17484l3 = new C17484l();
                            c17484l3.f34065l = -1L;
                            c17484l3.f34064l = 0L;
                            c17484l3.f34060l = false;
                            c17484l3.f34063l = 0L;
                            c17484l3.f34059l = c10815l.yandex;
                            c17484l3.f34058l = c10815l.loadAd;
                            c17484l3.f34062l = parcelFileDescriptorArrCreatePipe[0];
                            c17484l3.f34056l = parcelFileDescriptorArrCreatePipe2[0];
                            c17484l3.f34064l = 0L;
                            c17484l3.f34063l = c10815l.billing;
                            Pair pairCreate2 = Pair.create(parcelFileDescriptorArrCreatePipe[1], parcelFileDescriptorArrCreatePipe2[1]);
                            pairCreate2.getClass();
                            pairCreate = Pair.create(c17484l3, new C15563l(pairCreate2));
                        } catch (IOException e) {
                            Log.e("NearbyConnections", String.format("Unable to create PFD pipe for streaming payload %d from client to service.", Long.valueOf(c10815l.yandex)), e);
                            throw e;
                        }
                    }
                    C13452l c13452l = (C13452l) c11963l.metrica();
                    BinderC13190l binderC13190l = new BinderC13190l(c13132l);
                    C17484l c17484l4 = (C17484l) pairCreate.first;
                    Parcel parcelM743l = c13452l.m743l();
                    int i3 = AbstractC14866l.yandex;
                    parcelM743l.writeInt(1);
                    int iTapsense = AbstractC9968l.tapsense(parcelM743l, 20293);
                    AbstractC9968l.admob(parcelM743l, 1, binderC13190l);
                    AbstractC9968l.metrica(parcelM743l, 2, strArr);
                    AbstractC9968l.remoteconfig(parcelM743l, 3, c17484l4, 0);
                    AbstractC9968l.subscription(parcelM743l, 4, 4);
                    parcelM743l.writeInt(0);
                    AbstractC9968l.subscription(parcelM743l, 5, 4);
                    parcelM743l.writeInt(0);
                    AbstractC9968l.Signature(parcelM743l, iTapsense);
                    c13452l.m742l(parcelM743l, 2008);
                    if (((AbstractC13584l) pairCreate.second).loadAd()) {
                        Object objYandex = ((AbstractC13584l) pairCreate.second).yandex();
                        C7945l c7945l = c11963l.f23840volatile;
                        if (c7945l != null) {
                            C2494l c2494l = c10815l.purchase;
                            AbstractC1051l.subs(c2494l);
                            if (((ParcelFileDescriptor.AutoCloseInputStream) c2494l.f5290l) == null) {
                                ParcelFileDescriptor parcelFileDescriptor = (ParcelFileDescriptor) c2494l.f5291l;
                                AbstractC1051l.subs(parcelFileDescriptor);
                                c2494l.f5290l = new ParcelFileDescriptor.AutoCloseInputStream(parcelFileDescriptor);
                            }
                            ParcelFileDescriptor.AutoCloseInputStream autoCloseInputStream = (ParcelFileDescriptor.AutoCloseInputStream) c2494l.f5290l;
                            Pair pair = (Pair) objYandex;
                            ParcelFileDescriptor.AutoCloseOutputStream autoCloseOutputStream = new ParcelFileDescriptor.AutoCloseOutputStream((ParcelFileDescriptor) pair.first);
                            ParcelFileDescriptor.AutoCloseOutputStream autoCloseOutputStream2 = new ParcelFileDescriptor.AutoCloseOutputStream((ParcelFileDescriptor) pair.second);
                            C17484l c17484l5 = (C17484l) pairCreate.first;
                            long j = c10815l.yandex;
                            synchronized (c7945l) {
                                C5128l c5128l = c7945l.loadAd;
                                Long lValueOf = Long.valueOf(j);
                                c5128l.put(lValueOf, autoCloseInputStream);
                                c7945l.amazon.put(lValueOf, autoCloseOutputStream);
                                c7945l.purchase.put(lValueOf, c17484l5);
                                c7945l.yandex.execute(new RunnableC17276l(c7945l, autoCloseInputStream, autoCloseOutputStream, j, autoCloseOutputStream2));
                            }
                            return;
                        }
                        return;
                    }
                    return;
                } catch (IOException e2) {
                    Log.w("NearbyConnectionsClient", "Failed to create a Parcelable Payload.", e2);
                    C11963l.appmetrica(8013);
                    c13132l.yandex.loadAd(null);
                    return;
                }
        }
    }

    public void amazon(C15100l c15100l) {
        Iterator it = c15100l.yandex.iterator();
        while (it.hasNext()) {
            ((HashMap) this.f34134l).put(Integer.valueOf(((EnumC14263l) it.next()).f27934l).toString(), c15100l);
        }
    }

    public AbstractC0342l billing(long j, int i, String str) {
        AtomicReferenceArray atomicReferenceArray = (AtomicReferenceArray) this.f34134l;
        AbstractC0342l abstractC0342l = (AbstractC0342l) atomicReferenceArray.get(i);
        if (abstractC0342l != null) {
            return abstractC0342l;
        }
        C2342l c2342l = new C2342l(str, (C18096l) ((C3529l) this.f34133l).f7425l, j);
        while (!atomicReferenceArray.compareAndSet(i, null, c2342l)) {
            if (atomicReferenceArray.get(i) != null) {
                AbstractC0342l abstractC0342l2 = (AbstractC0342l) atomicReferenceArray.get(i);
                abstractC0342l2.getClass();
                return abstractC0342l2;
            }
        }
        return c2342l;
    }

    @Override // defpackage.InterfaceC9526l
    public ListenableFuture call() {
        InterfaceC14094l interfaceC14094l = (InterfaceC14094l) this.f34134l;
        C9226l c9226lLoadAd = AbstractC10540l.loadAd();
        InterfaceC14094l interfaceC14094lYandex = AbstractC10540l.yandex(c9226lLoadAd, interfaceC14094l);
        try {
            ListenableFuture listenableFutureCall = ((InterfaceC9526l) this.f34133l).call();
            AbstractC10540l.yandex(c9226lLoadAd, interfaceC14094lYandex);
            return listenableFutureCall;
        } catch (Throwable th) {
            try {
                AbstractC18239l.yandex(th);
                throw th;
            } catch (Throwable th2) {
                AbstractC10540l.yandex(c9226lLoadAd, interfaceC14094lYandex);
                throw th2;
            }
        }
    }

    @Override // defpackage.InterfaceC17641l
    public C7502l crashlytics(InterfaceC2167l interfaceC2167l) {
        C7502l c7502l = (C7502l) this.f34134l;
        c7502l.remoteconfig((String) this.f34133l, interfaceC2167l);
        return c7502l;
    }

    @Override // defpackage.InterfaceC0643l
    public Object loadAd(C1381l c1381l) throws IOException {
        Uri uri = (Uri) c1381l.f3514l;
        AtomicLong atomicLong = AbstractC4519l.yandex;
        int iMyPid = Process.myPid();
        long id = Thread.currentThread().getId();
        long jCurrentTimeMillis = System.currentTimeMillis();
        long andIncrement = AbstractC4519l.yandex.getAndIncrement();
        int length = String.valueOf(iMyPid).length();
        int length2 = String.valueOf(id).length();
        StringBuilder sb = new StringBuilder(length + 15 + length2 + 1 + String.valueOf(jCurrentTimeMillis).length() + 1 + String.valueOf(andIncrement).length());
        sb.append(".mobstore_tmp-");
        sb.append(iMyPid);
        sb.append("-");
        sb.append(id);
        sb.append("-");
        sb.append(jCurrentTimeMillis);
        sb.append("-");
        sb.append(andIncrement);
        Uri uriBuild = uri.buildUpon().path(String.valueOf(uri.getPath()).concat(sb.toString())).build();
        InterfaceC14033l interfaceC14033l = (InterfaceC14033l) c1381l.f3513l;
        ArrayList arrayListAdmob = c1381l.admob(interfaceC14033l.amazon(uriBuild));
        C5633l[] c5633lArr = (C5633l[]) this.f34133l;
        if (c5633lArr != null) {
            c5633lArr[0].admob(arrayListAdmob);
        }
        try {
            OutputStream outputStream = (OutputStream) arrayListAdmob.get(0);
            try {
                ((AbstractC12570l) this.f34134l).loadAd(outputStream);
                C5633l[] c5633lArr2 = (C5633l[]) this.f34133l;
                if (c5633lArr2 != null) {
                    C5633l c5633l = c5633lArr2[0];
                    if (((C17407l) c5633l.f11985l) == null) {
                        throw new C8413l("Cannot sync underlying stream");
                    }
                    ((OutputStream) c5633l.f11986l).flush();
                    ((C17407l) c5633l.f11985l).f33913l.getFD().sync();
                }
                outputStream.close();
                interfaceC14033l.billing(uriBuild, uri);
                return null;
            } catch (Throwable th) {
                if (outputStream != null) {
                    try {
                        outputStream.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        } catch (Exception e) {
            try {
                interfaceC14033l.purchase(uriBuild);
            } catch (FileNotFoundException unused) {
            }
            if (e instanceof IOException) {
                throw ((IOException) e);
            }
            throw new IOException(e);
        }
    }

    public AbstractC0342l mopub(String str, int i, String str2) {
        AtomicReferenceArray atomicReferenceArray = (AtomicReferenceArray) this.f34134l;
        AbstractC0342l abstractC0342l = (AbstractC0342l) atomicReferenceArray.get(i);
        if (abstractC0342l != null) {
            return abstractC0342l;
        }
        C6385l c6385l = new C6385l(str, (C18096l) ((C3529l) this.f34133l).f7425l, str2);
        while (!atomicReferenceArray.compareAndSet(i, null, c6385l)) {
            if (atomicReferenceArray.get(i) != null) {
                AbstractC0342l abstractC0342l2 = (AbstractC0342l) atomicReferenceArray.get(i);
                abstractC0342l2.getClass();
                return abstractC0342l2;
            }
        }
        return c6385l;
    }

    public InterfaceC2167l purchase(C7502l c7502l, InterfaceC2167l interfaceC2167l) {
        AbstractC13831l.metrica(c7502l);
        if (!(interfaceC2167l instanceof C15537l)) {
            return interfaceC2167l;
        }
        C15537l c15537l = (C15537l) interfaceC2167l;
        ArrayList arrayList = c15537l.f30347l;
        String str = c15537l.f30348l;
        HashMap map = (HashMap) this.f34134l;
        return (map.containsKey(str) ? (C15100l) map.get(str) : (C15100l) this.f34133l).yandex(str, c7502l, arrayList);
    }

    public String toString() {
        switch (this.f34135l) {
            case 8:
                InterfaceC9526l interfaceC9526l = (InterfaceC9526l) this.f34133l;
                StringBuilder sb = new StringBuilder(interfaceC9526l.toString().length() + 14);
                sb.append("propagating=[");
                sb.append(interfaceC9526l);
                sb.append("]");
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public AbstractC0342l yandex(String str, boolean z, int i) {
        AtomicReferenceArray atomicReferenceArray = (AtomicReferenceArray) this.f34134l;
        AbstractC0342l abstractC0342l = (AbstractC0342l) atomicReferenceArray.get(i);
        if (abstractC0342l != null) {
            return abstractC0342l;
        }
        C9299l c9299lYandex = ((C3529l) this.f34133l).yandex(str, z);
        while (!atomicReferenceArray.compareAndSet(i, null, c9299lYandex)) {
            if (atomicReferenceArray.get(i) != null) {
                AbstractC0342l abstractC0342l2 = (AbstractC0342l) atomicReferenceArray.get(i);
                abstractC0342l2.getClass();
                return abstractC0342l2;
            }
        }
        return c9299lYandex;
    }

    public /* synthetic */ C17516l(Object obj, Object obj2, int i) {
        this.f34135l = i;
        this.f34134l = obj;
        this.f34133l = obj2;
    }

    public C17516l(AbstractC12570l abstractC12570l) {
        this.f34135l = 7;
        this.f34134l = abstractC12570l;
    }

    public /* synthetic */ C17516l(C1062l c1062l, String str, C10815l c10815l) {
        this.f34135l = 4;
        this.f34134l = str;
        this.f34133l = c10815l;
    }

    public C17516l(C13904l c13904l, C12648l c12648l) {
        this.f34135l = 0;
        this.f34133l = c13904l;
        this.f34134l = c12648l;
    }

    public C17516l(C3529l c3529l, int i) {
        this.f34135l = 6;
        this.f34133l = c3529l;
        this.f34134l = new AtomicReferenceArray(i);
    }
}
