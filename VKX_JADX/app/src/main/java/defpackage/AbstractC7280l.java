package defpackage;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.RandomAccess;
import java.util.Set;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: lؚٕۛ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC7280l {
    public static byte[] admob(C4279l c4279l) {
        HashMap map = c4279l.yandex;
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            try {
                dataOutputStream.writeShort(-21521);
                dataOutputStream.writeShort(1);
                dataOutputStream.writeInt(map.size());
                for (Map.Entry entry : map.entrySet()) {
                    subs(dataOutputStream, (String) entry.getKey(), entry.getValue());
                }
                dataOutputStream.flush();
                if (dataOutputStream.size() > 10240) {
                    throw new IllegalStateException("Data cannot occupy more than 10240 bytes when serialized");
                }
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                dataOutputStream.close();
                return byteArray;
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    AbstractC7876l.loadAd(dataOutputStream, th);
                    throw th2;
                }
            }
        } catch (IOException e) {
            C14513l.tapsense().ads(AbstractC1696l.yandex, "Error in Data#toByteArray: ", e);
            return new byte[0];
        }
    }

    public static final InterfaceC16588l amazon(InterfaceC1388l interfaceC1388l, ArrayList arrayList, Function0 function0) {
        InterfaceC16588l c0087l;
        InterfaceC16588l c1574l;
        C2336l c2336l = AbstractC18202l.yandex;
        if (interfaceC1388l.equals(c2336l.loadAd(Collection.class)) || interfaceC1388l.equals(c2336l.loadAd(List.class)) || interfaceC1388l.equals(c2336l.loadAd(List.class)) || interfaceC1388l.equals(c2336l.loadAd(ArrayList.class))) {
            c0087l = new C0087l((InterfaceC16588l) arrayList.get(0), 0);
        } else if (interfaceC1388l.equals(c2336l.loadAd(HashSet.class))) {
            c0087l = new C0087l((InterfaceC16588l) arrayList.get(0), 1);
        } else if (interfaceC1388l.equals(c2336l.loadAd(Set.class)) || interfaceC1388l.equals(c2336l.loadAd(Set.class)) || interfaceC1388l.equals(c2336l.loadAd(LinkedHashSet.class))) {
            c0087l = new C0087l((InterfaceC16588l) arrayList.get(0), 2);
        } else if (interfaceC1388l.equals(c2336l.loadAd(HashMap.class))) {
            c0087l = new C0185l((InterfaceC16588l) arrayList.get(0), (InterfaceC16588l) arrayList.get(1), 0);
        } else if (interfaceC1388l.equals(c2336l.loadAd(Map.class)) || interfaceC1388l.equals(c2336l.loadAd(Map.class)) || interfaceC1388l.equals(c2336l.loadAd(LinkedHashMap.class))) {
            c0087l = new C0185l((InterfaceC16588l) arrayList.get(0), (InterfaceC16588l) arrayList.get(1), 1);
        } else {
            if (interfaceC1388l.equals(c2336l.loadAd(Map.Entry.class))) {
                c1574l = new C14733l((InterfaceC16588l) arrayList.get(0), (InterfaceC16588l) arrayList.get(1), 0);
            } else if (interfaceC1388l.equals(c2336l.loadAd(C8195l.class))) {
                c1574l = new C14733l((InterfaceC16588l) arrayList.get(0), (InterfaceC16588l) arrayList.get(1), 1);
            } else if (interfaceC1388l.equals(c2336l.loadAd(C12823l.class))) {
                c0087l = new C3641l((InterfaceC16588l) arrayList.get(0), (InterfaceC16588l) arrayList.get(1), (InterfaceC16588l) arrayList.get(2));
            } else if (((InterfaceC13937l) interfaceC1388l).mo1730private().isArray()) {
                c1574l = new C1574l((InterfaceC1388l) function0.invoke(), (InterfaceC16588l) arrayList.get(0));
            } else {
                c0087l = null;
            }
            c0087l = c1574l;
        }
        if (c0087l != null) {
            return c0087l;
        }
        InterfaceC16588l[] interfaceC16588lArr = (InterfaceC16588l[]) arrayList.toArray(new InterfaceC16588l[0]);
        return AbstractC17457l.subs(interfaceC1388l, (InterfaceC16588l[]) Arrays.copyOf(interfaceC16588lArr, interfaceC16588lArr.length));
    }

    public static final InterfaceC16588l billing(InterfaceC1388l interfaceC1388l) {
        InterfaceC16588l interfaceC16588lSubs = AbstractC17457l.subs(interfaceC1388l, new InterfaceC16588l[0]);
        return interfaceC16588lSubs == null ? (InterfaceC16588l) AbstractC14414l.yandex.get(interfaceC1388l) : interfaceC16588lSubs;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.io.Serializable, java.lang.Double[]] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.io.Serializable, java.lang.Float[]] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.io.Serializable, java.lang.Long[]] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.io.Serializable, java.lang.Integer[]] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.io.Serializable, java.lang.Byte[]] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.io.Serializable, java.lang.Boolean[]] */
    /* JADX WARN: Type inference failed for: r1v14, types: [java.io.Serializable, java.lang.String[]] */
    public static final Serializable crashlytics(DataInputStream dataInputStream, byte b) throws IOException {
        if (b == 0) {
            return null;
        }
        if (b == 1) {
            return Boolean.valueOf(dataInputStream.readBoolean());
        }
        if (b == 2) {
            return Byte.valueOf(dataInputStream.readByte());
        }
        if (b == 3) {
            return Integer.valueOf(dataInputStream.readInt());
        }
        if (b == 4) {
            return Long.valueOf(dataInputStream.readLong());
        }
        if (b == 5) {
            return Float.valueOf(dataInputStream.readFloat());
        }
        if (b == 6) {
            return Double.valueOf(dataInputStream.readDouble());
        }
        if (b == 7) {
            return dataInputStream.readUTF();
        }
        int i = 0;
        if (b == 8) {
            int i2 = dataInputStream.readInt();
            ?? r0 = new Boolean[i2];
            while (i < i2) {
                r0[i] = Boolean.valueOf(dataInputStream.readBoolean());
                i++;
            }
            return r0;
        }
        if (b == 9) {
            int i3 = dataInputStream.readInt();
            ?? r1 = new Byte[i3];
            while (i < i3) {
                r1[i] = Byte.valueOf(dataInputStream.readByte());
                i++;
            }
            return r1;
        }
        if (b == 10) {
            int i4 = dataInputStream.readInt();
            ?? r2 = new Integer[i4];
            while (i < i4) {
                r2[i] = Integer.valueOf(dataInputStream.readInt());
                i++;
            }
            return r2;
        }
        if (b == 11) {
            int i5 = dataInputStream.readInt();
            ?? r3 = new Long[i5];
            while (i < i5) {
                r3[i] = Long.valueOf(dataInputStream.readLong());
                i++;
            }
            return r3;
        }
        if (b == 12) {
            int i6 = dataInputStream.readInt();
            ?? r4 = new Float[i6];
            while (i < i6) {
                r4[i] = Float.valueOf(dataInputStream.readFloat());
                i++;
            }
            return r4;
        }
        if (b == 13) {
            int i7 = dataInputStream.readInt();
            ?? r5 = new Double[i7];
            while (i < i7) {
                r5[i] = Double.valueOf(dataInputStream.readDouble());
                i++;
            }
            return r5;
        }
        if (b != 14) {
            C8339l.smaato(AbstractC0653l.vip(b, "Unsupported type "));
            return null;
        }
        int i8 = dataInputStream.readInt();
        ?? r6 = new String[i8];
        while (i < i8) {
            String utf = dataInputStream.readUTF();
            if (AbstractC8576l.yandex(utf, "androidx.work.Data-95ed6082-b8e9-46e8-a73f-ff56f00f5d9d")) {
                utf = null;
            }
            r6[i] = utf;
            i++;
        }
        return r6;
    }

    public static void firebase(int i, Object obj) {
        if (obj != null) {
            return;
        }
        C6541l.subs(AbstractC9361l.Signature(i, "at index ", new StringBuilder(String.valueOf(i).length() + 9)));
    }

    public static AbstractList isPro(InterfaceC17302l interfaceC17302l, List list) {
        return list instanceof RandomAccess ? new C7002l(interfaceC17302l, list) : new C16253l(interfaceC17302l, list);
    }

    public static C4279l loadAd(byte[] bArr) {
        if (bArr.length > 10240) {
            C8339l.smaato("Data cannot occupy more than 10240 bytes when serialized");
            return null;
        }
        if (bArr.length == 0) {
            return C4279l.loadAd;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        try {
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
            byte[] bArr2 = new byte[2];
            byteArrayInputStream.read(bArr2);
            int i = 0;
            boolean z = bArr2[0] == -84 && bArr2[1] == -19;
            byteArrayInputStream.reset();
            if (z) {
                ObjectInputStream objectInputStream = new ObjectInputStream(byteArrayInputStream);
                try {
                    int i2 = objectInputStream.readInt();
                    while (i < i2) {
                        linkedHashMap.put(objectInputStream.readUTF(), objectInputStream.readObject());
                        i++;
                    }
                    objectInputStream.close();
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        AbstractC7876l.loadAd(objectInputStream, th);
                        throw th2;
                    }
                }
            } else {
                DataInputStream dataInputStream = new DataInputStream(byteArrayInputStream);
                try {
                    short s = dataInputStream.readShort();
                    if (s == -21521) {
                        short s2 = dataInputStream.readShort();
                        if (s2 != 1) {
                            C8936l.subs(AbstractC0653l.vip(s2, "Unsupported version number: "));
                        }
                    } else {
                        C8936l.subs(AbstractC0653l.vip(s, "Magic number doesn't match: "));
                    }
                    int i3 = dataInputStream.readInt();
                    while (i < i3) {
                        linkedHashMap.put(dataInputStream.readUTF(), crashlytics(dataInputStream, dataInputStream.readByte()));
                        i++;
                    }
                    dataInputStream.close();
                } catch (Throwable th3) {
                    try {
                        throw th3;
                    } catch (Throwable th4) {
                        AbstractC7876l.loadAd(dataInputStream, th3);
                        throw th4;
                    }
                }
            }
        } catch (IOException e) {
            C14513l.tapsense().ads(AbstractC1696l.yandex, "Error in Data#fromByteArray: ", e);
        } catch (ClassNotFoundException e2) {
            C14513l.tapsense().ads(AbstractC1696l.yandex, "Error in Data#fromByteArray: ", e2);
        }
        return new C4279l(linkedHashMap);
    }

    public static final ArrayList mopub(C13975l c13975l, List list, boolean z) {
        if (!z) {
            ArrayList arrayList = new ArrayList(AbstractC14055l.billing(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                InterfaceC16588l interfaceC16588lLoadAd = AbstractC17332l.loadAd(c13975l, (InterfaceC13012l) it.next(), false);
                if (interfaceC16588lLoadAd == null) {
                    return null;
                }
                arrayList.add(interfaceC16588lLoadAd);
            }
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList(AbstractC14055l.billing(list, 10));
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            InterfaceC13012l interfaceC13012l = (InterfaceC13012l) it2.next();
            InterfaceC16588l interfaceC16588lLoadAd2 = AbstractC17332l.loadAd(c13975l, interfaceC13012l, true);
            if (interfaceC16588lLoadAd2 == null) {
                AbstractC16164l.isPro(AbstractC16164l.billing(interfaceC13012l));
                throw null;
            }
            arrayList2.add(interfaceC16588lLoadAd2);
        }
        return arrayList2;
    }

    public static List purchase(List list) {
        if (list instanceof AbstractC1186l) {
            return ((AbstractC1186l) list).applovin();
        }
        if (list instanceof C8204l) {
            return ((C8204l) list).f17104l;
        }
        return list instanceof RandomAccess ? new C9045l(list) : new C8204l(list);
    }

    public static final void subs(DataOutputStream dataOutputStream, String str, Object obj) throws IOException {
        int i;
        if (obj == null) {
            dataOutputStream.writeByte(0);
        } else if (obj instanceof Boolean) {
            dataOutputStream.writeByte(1);
            dataOutputStream.writeBoolean(((Boolean) obj).booleanValue());
        } else if (obj instanceof Byte) {
            dataOutputStream.writeByte(2);
            dataOutputStream.writeByte(((Number) obj).byteValue());
        } else if (obj instanceof Integer) {
            dataOutputStream.writeByte(3);
            dataOutputStream.writeInt(((Number) obj).intValue());
        } else if (obj instanceof Long) {
            dataOutputStream.writeByte(4);
            dataOutputStream.writeLong(((Number) obj).longValue());
        } else if (obj instanceof Float) {
            dataOutputStream.writeByte(5);
            dataOutputStream.writeFloat(((Number) obj).floatValue());
        } else if (obj instanceof Double) {
            dataOutputStream.writeByte(6);
            dataOutputStream.writeDouble(((Number) obj).doubleValue());
        } else if (obj instanceof String) {
            dataOutputStream.writeByte(7);
            dataOutputStream.writeUTF((String) obj);
        } else {
            if (!(obj instanceof Object[])) {
                C18262l.startapp(AbstractC18202l.yandex.loadAd(obj.getClass()).license(), "Unsupported value type ");
                return;
            }
            Object[] objArr = (Object[]) obj;
            Class<?> cls = objArr.getClass();
            C2336l c2336l = AbstractC18202l.yandex;
            InterfaceC1388l interfaceC1388lLoadAd = c2336l.loadAd(cls);
            if (AbstractC8576l.yandex(interfaceC1388lLoadAd, c2336l.loadAd(Boolean[].class))) {
                i = 8;
            } else if (AbstractC8576l.yandex(interfaceC1388lLoadAd, c2336l.loadAd(Byte[].class))) {
                i = 9;
            } else if (AbstractC8576l.yandex(interfaceC1388lLoadAd, c2336l.loadAd(Integer[].class))) {
                i = 10;
            } else if (AbstractC8576l.yandex(interfaceC1388lLoadAd, c2336l.loadAd(Long[].class))) {
                i = 11;
            } else if (AbstractC8576l.yandex(interfaceC1388lLoadAd, c2336l.loadAd(Float[].class))) {
                i = 12;
            } else if (AbstractC8576l.yandex(interfaceC1388lLoadAd, c2336l.loadAd(Double[].class))) {
                i = 13;
            } else {
                if (!AbstractC8576l.yandex(interfaceC1388lLoadAd, c2336l.loadAd(String[].class))) {
                    C18262l.startapp(c2336l.loadAd(objArr.getClass()).billing(), "Unsupported value type ");
                    return;
                }
                i = 14;
            }
            dataOutputStream.writeByte(i);
            dataOutputStream.writeInt(objArr.length);
            for (Object obj2 : objArr) {
                if (i == 8) {
                    Boolean bool = obj2 instanceof Boolean ? (Boolean) obj2 : null;
                    dataOutputStream.writeBoolean(bool != null ? bool.booleanValue() : false);
                } else if (i == 9) {
                    Byte b = obj2 instanceof Byte ? (Byte) obj2 : null;
                    dataOutputStream.writeByte(b != null ? b.byteValue() : (byte) 0);
                } else if (i == 10) {
                    Integer num = obj2 instanceof Integer ? (Integer) obj2 : null;
                    dataOutputStream.writeInt(num != null ? num.intValue() : 0);
                } else if (i == 11) {
                    Long l = obj2 instanceof Long ? (Long) obj2 : null;
                    dataOutputStream.writeLong(l != null ? l.longValue() : 0L);
                } else if (i == 12) {
                    Float f = obj2 instanceof Float ? (Float) obj2 : null;
                    dataOutputStream.writeFloat(f != null ? f.floatValue() : 0.0f);
                } else if (i == 13) {
                    Double d = obj2 instanceof Double ? (Double) obj2 : null;
                    dataOutputStream.writeDouble(d != null ? d.doubleValue() : 0.0d);
                } else if (i == 14) {
                    String str2 = obj2 instanceof String ? (String) obj2 : null;
                    if (str2 == null) {
                        str2 = "androidx.work.Data-95ed6082-b8e9-46e8-a73f-ff56f00f5d9d";
                    }
                    dataOutputStream.writeUTF(str2);
                }
            }
        }
        dataOutputStream.writeUTF(str);
    }

    public static final InterfaceC17242l yandex(InterfaceC17242l interfaceC17242l, Function2 function2) {
        return interfaceC17242l.premium(new C2259l(function2));
    }
}
